/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.exception;

/**
 * AutoCloseable Demo.
 * 
 * @since 1.0.0 2019年4月21日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
class AutoCloseableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(Resource res = new Resource()) {
            res.doSome();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Resource implements AutoCloseable {
    void doSome() {
        System.out.println("do something");
    }
    @Override
    public void close() throws Exception {
        System.out.println("resource is closed");
    }
}
