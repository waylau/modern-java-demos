/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * JDK11:Unicode 10
 * JEP 327：http://openjdk.java.net/jeps/327
 * 
 * @since 1.0.0 2018年12月23日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class Unicode10Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 控制台输出😀
		System.out.println(Character.toChars(0x1F600)); //  显示😀

		// 使用GUI显示😀
		GuiApp();
	}

	public static void GuiApp()
	{
		JLabel emoji = new JLabel("\uD83D\uDE00");   // U+1F600
		        
	    JFrame frame = new JFrame("Emoji示例");
	    frame.setSize(400, 100);
	    frame.add(emoji);
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
	}
}
