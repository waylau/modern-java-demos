/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk14;

/**
 * JDK 14: Text Blocks (Preview)
 * JEP 368: http://openjdk.java.net/jeps/368
 * 
 * @since 1.0.0 2020年3月22日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class TextBlocksDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("preview")
	public static void main(String[] args) {
		// JDK13之前
		String html = "<html>\n" +
	              "    <body>\n" +
	              "        <p>Hello, world</p>\n" +
	              "    </body>\n" +
	              "</html>\n";

		// JDK13之后
	    String html2 = """
	              <html>
	                  <body>
	                      <p>Hello, world</p>
	                  </body>
	              </html>
	              """;
	    
	    System.out.println(html);
	    System.out.println(html2);
	}

}
