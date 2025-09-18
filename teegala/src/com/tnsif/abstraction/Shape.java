package com.tnsif.abstraction;

public abstract class Shape {
	protected float area;
	abstract void CalArea();
	public void show() {
		System.out.println("The area of shape is : "+ area);
	}
}
