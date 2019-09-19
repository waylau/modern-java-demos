/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;

/**
 * JDK8:Optional.
 * 
 * @since 1.0.0 2019年4月20日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class OptionalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User();

		// JDK8之前

		// 判断姓名是否是Lau结尾
		if (user.getName() != null) {
			System.out.println(user.getName().endsWith("Lau"));
		}

		// 判断地址用户的地址名称是否是Lau结尾
		if (user.getAddress() != null) {
			if (user.getAddress().getName() != null) {
				System.out.println(user.getAddress().getName().endsWith("Lau"));
			}
		}

		// JDK8之后
		Optional<Address> opt = user.getOptionalAddress();

		if (opt.isPresent()) {
			if (opt.get().getName() != null) {
				System.out.println(opt.get().getName().endsWith("Lau"));
			}
		}

	}

	/**
	 * test filter
	 */
	@Test
	void testFilter() {
		User user = new User();
		Address address = new Address();
		address.setName("Address from Way Lau");
		user.setAddress(address);
		user.setName("Way Lau");

		// 过滤用户的地址信息，只保留以“Lau”结尾的地址
		Optional<Address> opt = user.getOptionalAddress()
				.filter(a -> a.getName() != null && a.getName().endsWith("Lau"));

		assertEquals("Address from Way Lau", opt.get().getName());

	}

	/**
	 * test of\ofNullable
	 */
	@Test
	void testOf() {
		// of
		Optional<Integer> i = Optional.of(1);

		// 无需判断是否存在
		assertEquals(1, i.get().intValue());

		/*
		 * Optional<Integer> i = Optional.of(null); //错误！参数不能是null
		 */

		// ofNullable
		Optional<Integer> i1 = Optional.ofNullable(null); // 参数可以是null
		assertEquals(null, i1.isPresent() ? i1.get().intValue() : null);

		Optional<Integer> i2 = Optional.ofNullable(2);// 参数可以是非null
		assertEquals(2, i2.isPresent() ? i2.get().intValue() : 0);
	}

	/**
	 * test empty
	 */
	@Test
	void testEmpty() {
		// ofNullable
		Optional<Integer> i1 = Optional.ofNullable(null); // 是null

		// empty
		Optional<Integer> i2 = Optional.empty();

		assertEquals(i1, i2);
	}

	/**
	 * test orElse
	 */
	@Test
	void testOrElse() {
		// ofNullable
		Optional<Integer> i1 = Optional.ofNullable(null); // 是null

		// orElse
		assertEquals(100, i1.orElse(100).intValue());

		// of
		Optional<Integer> i2 = Optional.of(100); // 不是null

		// orElse
		assertEquals(100, i2.orElse(20).intValue());
	}

	/**
	 * test orElseGet
	 */
	@Test
	void testOrElseGet() {
		// ofNullable
		Optional<Integer> i1 = Optional.ofNullable(null); // 是null

		// orElseGet
		assertEquals(100, i1.orElseGet(() -> {
			return 100;
		}).intValue());

		// of
		Optional<Integer> i2 = Optional.of(100); // 不是null

		// orElseGet
		assertEquals(100, i2.orElseGet(() -> {
			return 20;
		}).intValue());
	}

	/**
	 * test orElseThrow
	 */
	@Test
	void testOrElseThrow() {
		// ofNullable
		Optional<Integer> i1 = Optional.ofNullable(null); // 是null

		// orElseThrow
		/*
		i1.orElseThrow(); // 异常!将抛出NoSuchElementException
		i1.orElseThrow(()->{throw new IllegalStateException();});// 异常!将抛出IllegalStateException
		*/
	}
	
	
	/**
	 * test isEmpty
	 */
	@Test
	void testIsEmpty() {
		// ofNullable
		Optional<Integer> i1 = Optional.ofNullable(null); // 是null
		
		// isEmpty
		assertEquals(true, i1.isEmpty());
	}
}

class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 地址信息
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// 对getAddress方法的重构
	public Optional<Address> getOptionalAddress() {
		return Optional.ofNullable(address);
	}

}

class Address {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
