package com.tnsif.abstraction;

public class Rectangle extends Shape{
	private int length=5,breadth=2;
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void CalArea() {
		super.area=length*breadth;
		}
}
