package com.shape.oopLab1;

public class Triangle extends Shape {

	double height;
	double base;
	static String shapetype = "Triangle";
	
	public Triangle(String color,double height,double base) {
		super(color,shapetype);
		this.height = height;
		this.base   = base;
	}
	
	@Override
	public double calculateArea() {
		super.area = (this.height*this.base)/2;
		return super.area;
	}
	
	@Override
    public double calculatePerimeter() {
		
		super.perimeter = (height+base)+Math.sqrt(height*height+base*base);
		return super.perimeter;
	}
	
	@Override
	public void drawShape() {
			
	    	System.out.println("This shape is "+super.type);
	}

    public void displayDetail() {
		
    	System.out.println("This shape color is :"+super.color);
	}

}
