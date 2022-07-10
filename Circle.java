package com.shape.oopLab1;

public class Circle extends Shape{

	double radius;
	final double pi = 3.14;
	
	public Circle(String color,double radius) {
		super(color,"Circle");
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		
		super.area = this.pi*this.radius*this.radius;
		return super.area;
	}
	
	@Override
    public double calculatePerimeter() {
		
		super.perimeter = 2*this.pi*this.radius;
		return super.perimeter ;
	}
	
	@Override
	public void drawShape() {
			
	    	System.out.println("This shape is "+super.type);
	}

    public void displayDetail() {
		
    	System.out.println("This shape color is :"+super.color);
	}
}
