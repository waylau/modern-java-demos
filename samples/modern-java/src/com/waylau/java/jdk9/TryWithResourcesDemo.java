/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk9;

/**
 * JDK9:try-with-resources
 * 
 * @since 1.0.0 2018年12月25日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class TryWithResourcesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResourceSome some = new ResourceSome(); 
		ResourceOther other = new ResourceOther();
		
		// JDK7
		try (ResourceSome _some = some; 
				ResourceOther _other = other) {
			_some.doSome();
			_other.doOther();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		// JDK9
		try (some; 
				other) {
			some.doSome();
			other.doOther();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

class ResourceSome implements AutoCloseable {
	void doSome() {
		System.out.println("do something");
	}

	@Override
	public void close() throws Exception {
		System.out.println("some resource is closed");
	}
}

class ResourceOther implements AutoCloseable {
	void doOther() {
		System.out.println("do other things");
	}

	@Override
	public void close() throws Exception {
		System.out.println("other resource is closed");
	}
}
