package com.waylau.java.jdk8;

class Apple {
	private String brand; // 牌子

	private Integer weight; // 重量
	
	public Apple(String brand, Integer weight) {
		this.brand = brand;
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [brand=" + brand + ", weight=" + weight + "]";
	}
	
}