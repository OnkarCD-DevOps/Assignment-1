package org.bits.runner;

import org.bits.impl.Circle;
import org.bits.impl.Rectangle;

public class ShapeRunner {
	public static void main(String[] args) {
		// Rectangle area and parameter
		double length = 5.0;
		double breadth = 3.0;
		Rectangle r = new Rectangle(length, breadth);

		System.out.println("------------Shape:Rectangle---------------");
		System.out.println("Rectangle - Area: " + r.area());
		System.out.println("Rectangle - perimeter: " + r.perimeter());

		/*
		 * Adding another test case for rectangle
		 */
		Rectangle r2 = new Rectangle(5.0, 3.0);
		System.out.println("------------Shape:Rectangle---------------");
		System.out.println("Rectangle - Area: " + r2.area());
		System.out.println("Rectangle - perimeter: " + r2.perimeter());

		// Circle area and parameter
		double radius = 2.0;
		Circle c = new Circle(radius);
		System.out.println("Circle - Area: " + c.area());
		System.out.println("Circle - perimeter: " + c.perimeter());

	}
}
