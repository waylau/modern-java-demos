/**
 * 
 */
package com.waylau.java.io.path;

import static java.nio.file.FileVisitResult.CONTINUE;
import static java.nio.file.FileVisitResult.SKIP_SUBTREE;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.EnumSet;

/**
 * Copy Demo.
 * 
 * @since 1.0.0 2019年4月16日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class Copy {

	static boolean okayToOverwrite(Path file) {
		String answer = System.console().readLine("覆盖 %s (yes/no)? ", file);
		return (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));
	}

	/**
	 * 拷贝文件.
	 * 
	 * @param source
	 * @param target
	 * @param prompt
	 * @param preserve
	 */
	static void copyFile(Path source, Path target, boolean prompt, boolean preserve) {
		CopyOption[] options = (preserve) ? new CopyOption[] { COPY_ATTRIBUTES, REPLACE_EXISTING }
				: new CopyOption[] { REPLACE_EXISTING };
		if (!prompt || Files.notExists(target) || okayToOverwrite(target)) {
			try {
				Files.copy(source, target, options);
			} catch (IOException x) {
				System.err.format("无法拷贝: %s: %s%n", source, x);
			}
		}
	}

	static class TreeCopier implements FileVisitor<Path> {
		private final Path source;
		private final Path target;
		private final boolean prompt;
		private final boolean preserve;

		TreeCopier(Path source, Path target, boolean prompt, boolean preserve) {
			this.source = source;
			this.target = target;
			this.prompt = prompt;
			this.preserve = preserve;
		}

		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
			CopyOption[] options = (preserve) ? new CopyOption[] { COPY_ATTRIBUTES } : new CopyOption[0];

			Path newdir = target.resolve(source.relativize(dir));
			try {
				Files.copy(dir, newdir, options);
			} catch (FileAlreadyExistsException x) {
				// ...
			} catch (IOException x) {
				System.err.format("Unable to create: %s: %s%n", newdir, x);
				return SKIP_SUBTREE;
			}
			return CONTINUE;
		}

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
			copyFile(file, target.resolve(source.relativize(file)), prompt, preserve);
			return CONTINUE;
		}

		@Override
		public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
			if (exc == null && preserve) {
				Path newdir = target.resolve(source.relativize(dir));
				try {
					FileTime time = Files.getLastModifiedTime(dir);
					Files.setLastModifiedTime(newdir, time);
				} catch (IOException x) {
					System.err.format("无法拷贝所有属性到: %s%n", newdir, x);
				}
			}
			return CONTINUE;
		}

		@Override
		public FileVisitResult visitFileFailed(Path file, IOException exc) {
			if (exc instanceof FileSystemLoopException) {
				System.err.println("检测到周期: " + file);
			} else {
				System.err.format("无法拷贝: %s: %s%n", file, exc);
			}
			return CONTINUE;
		}
	}

	static void usage() {
		System.err.println("java Copy [-ip] source... target");
		System.err.println("java Copy -r [-ip] source-dir... target");
		System.exit(-1);
	}

	public static void main(String[] args) throws IOException {
		boolean recursive = false;
		boolean prompt = false;
		boolean preserve = false;

		int argi = 0;
		while (argi < args.length) {
			String arg = args[argi];
			if (!arg.startsWith("-"))
				break;
			if (arg.length() < 2)
				usage();
			for (int i = 1; i < arg.length(); i++) {
				char c = arg.charAt(i);
				switch (c) {
				case 'r':
					recursive = true;
					break;
				case 'i':
					prompt = true;
					break;
				case 'p':
					preserve = true;
					break;
				default:
					usage();
				}
			}
			argi++;
		}

		int remaining = args.length - argi;
		if (remaining < 2)
			usage();
		Path[] source = new Path[remaining - 1];
		int i = 0;
		while (remaining > 1) {
			source[i++] = Paths.get(args[argi++]);
			remaining--;
		}
		Path target = Paths.get(args[argi]);

		// 检查目标是否是目录
		boolean isDir = Files.isDirectory(target);

		// 拷贝所有的源文件和目录到指定的目标
		for (i = 0; i < source.length; i++) {
			Path dest = (isDir) ? target.resolve(source[i].getFileName()) : target;

			if (recursive) {
				// 拷贝文件时跟踪链接
				EnumSet<FileVisitOption> opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
				TreeCopier tc = new TreeCopier(source[i], dest, prompt, preserve);
				Files.walkFileTree(source[i], opts, Integer.MAX_VALUE, tc);
			} else {
				// not recursive so source must not be a directory
				if (Files.isDirectory(source[i])) {
					System.err.format("%s: 是一个目录%n", source[i]);
					continue;
				}
				copyFile(source[i], dest, prompt, preserve);
			}
		}
	}
}