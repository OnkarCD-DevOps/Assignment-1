package org.bits.impl;

import org.bits.ifc.Shape;

public class Square implements Shape {
	private double side;
	
	public Square(double length) {
		this.side = length;
	}

	@Override
	public double area() {
		return side * side;
	}

	@Override
	public double perimeter() {
		return 4*side;
	}
}
