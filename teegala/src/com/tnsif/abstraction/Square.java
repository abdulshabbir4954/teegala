package com.tnsif.abstraction;

public class Square extends Shape {
	private int side=2;
	public Square(int side) {
		this.side=side;
	}
	void CalArea() {
		super.area=side*side;
	}

}