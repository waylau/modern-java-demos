/**
 * 
 */
package com.waylau.java.io.commandline;

import java.io.Console;
import java.util.Arrays;

/**
 * Console Password Demo.
 * 
 * @since 1.0.0 2019年4月15日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class Password {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console c = System.console();
		if (c == null) {
			System.err.println("没有Console对象.");
			System.exit(1);
		}

		String login = c.readLine("输入用户名登录: ");
		char[] oldPassword = c.readPassword("输入旧密码: ");

		if (verify(login, oldPassword)) {
			boolean noMatch;
			do {
				char[] newPassword1 = c.readPassword("输入新密码: ");
				char[] newPassword2 = c.readPassword("再次输入新密码: ");
				noMatch = !Arrays.equals(newPassword1, newPassword2);
				if (noMatch) {
					c.format("两次密码不匹配. 重试.%n");
				} else {
					change(login, newPassword1);
					c.format("用户 %s 的密码已经更改完成.%n", login);
				}
				Arrays.fill(newPassword1, ' ');
				Arrays.fill(newPassword2, ' ');
			} while (noMatch);
		}

		Arrays.fill(oldPassword, ' ');
	}

	static boolean verify(String login, char[] password) {
		// ...
		return true;
	}

	static void change(String login, char[] password) {
		// ...
	}
}
