package com.shape.oopLab1;

public class Circle extends Shape{

	double radius;
	final double pi = 3.14;
	
	public Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		
		return this.pi*this.radius*this.radius;
	}
	
	@Override
    public double calculatePerimeter() {
		
		return 2*this.pi*this.radius;
	}
	
	@Override
    public void display() {
		
    	System.out.println("This is Circle Shape and Color is :"+super.color);
	}
}
