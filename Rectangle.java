package com.shape.oopLab1;

public class Rectangle extends Shape{
 
	double height;
	double width;
	
	public Rectangle(String color,double height,double width) {
		super(color);
		this.height = height;
		this.width  = width;
			
	}
	
	@Override
	public double calculateArea() {
		
		return this.height*this.width;
	}
	
	@Override
    public double calculatePerimeter() {
		
		return (2*this.width)+(2*this.height);
	}
	
	@Override
    public void display() {
		
    	System.out.println("This is Rectnagle Shape and Color is :"+super.color);
	}
	
	

}
