package org.bits.impl;

import org.bits.ifc.Shape;

public class RightTriangle implements Shape {
	private double base;
	private double height;

	public RightTriangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return base * height / 2;
	}

	@Override
	public double perimeter() {
		return base + height + Math.sqrt(base * base + height * height);
	}
}
