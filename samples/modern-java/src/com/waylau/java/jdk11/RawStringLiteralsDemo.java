/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk11;

/**
 * JDK11:Raw String Literals（原始字符串文字）.
 * JEP 326:http://openjdk.java.net/jeps/326
 * 
 * @since 1.0.0 2018年12月22日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class RawStringLiteralsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		// JDK10之前
		String sql1 = "select id, name \n "
	            + " from user \n"
	            + " where id=? \n"
	            + " and deleteFlag = 0";
	 
		String json1 = "{\n"
	             +    "\"id\": 123,\n"
	             +    "\name\": \"Yanbin\"\n"
	             + "}";

		// JDK10之后
		String sql =`select id, name
	               from user
	               where id=?
	                 and deleteFlag = 0`;
		 
		String json = `{
		                 "id": 123,
		                 "name": "Yanbin"
		               }`;

		// 处理包含斜撇号的字符串
        String query = ``
               SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`
               WHERE `CITY` = 'INDIANAPOLIS'
               ORDER BY `EMP_ID`, `LAST_NAME`;
             ``;
        
        // 处理文件路径
        Runtime.getRuntime().exec("\"C:\\Program Files\\foo\" bar"); // JDK11之前
        
        Runtime.getRuntime().exec(`"C:\Program Files\foo" bar`); // JDK11之后
        
        // 正则表达式
        System.out.println("this".matches("\\w\\w\\w\\w")); // JDK11之前
        
        System.out.println("this".matches(`\w\w\w\w`)); // JDK11之后

		*/
	}

}
