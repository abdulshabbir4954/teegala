package com.tnsif.abstraction;

public class Main {

	public static void main(String[] args) {
		Square sq=new Square(9);
		sq.CalArea();
		sq.show();
		Rectangle r=new Rectangle(8,9);
		r.CalArea();
		r.show();
	}

}
