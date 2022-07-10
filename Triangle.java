package com.shape.oopLab1;

public class Triangle extends Shape {

	double height;
	double base;
	
	public Triangle(String color,double height,double base) {
		super(color);
		this.height = height;
		this.base   = base;
	}
	
	@Override
	public double calculateArea() {
		
		return (this.height*this.base)/2;
	}
	
	@Override
    public double calculatePerimeter() {
		
		return (height+base)+Math.sqrt(height*height+base*base);
	}
	
	@Override
    public void display() {
		
    	System.out.println("This is Circle Shape and Color is :"+super.color);
	}

}
