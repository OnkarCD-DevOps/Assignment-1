package org.bits.runner;

import org.bits.ifc.Shape;
import org.bits.impl.Circle;
import org.bits.impl.Rectangle;
import org.bits.impl.RightTriangle;

public class ShapeRunner {
	public static void main(String[] args) {
		// Rectangle area and parameter
		double length = 5.0;
		double breadth = 3.0;
		Shape rect1 = new Rectangle(length, breadth);
		System.out.println("------------Shape:Rectangle---------------");
		System.out.println("Rectangle - Area: " + rect1.area());
		System.out.println("Rectangle - perimeter: " + rect1.perimeter());

		/*
		 * Adding another test case for rectangle
		 */
		Shape r2 = new Rectangle(5.0, 3.0);

		System.out.println("------------Shape:Rectangle---------------");

		System.out.println("Rectangle - Area: " + r2.area());
		System.out.println("Rectangle - perimeter: " + r2.perimeter());

		// Circle area and parameter
		double radius = 2.0;
		Shape c = new Circle(radius);
		System.out.println("Circle - Area: " + c.area());
		System.out.println("Circle - perimeter: " + c.perimeter());

		Shape rgtTriangle = new RightTriangle(3, 4);
		System.out.println("Area of Right Triangle - " + rgtTriangle.area());
		System.out.println("Perimeter of right triangle - " + rgtTriangle.perimeter());

	}
}
