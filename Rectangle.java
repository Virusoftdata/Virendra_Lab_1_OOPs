package com.shape.oopLab1;

public class Rectangle extends Shape{
 
	double height;
	double width;
	double perimeter;
	static String shapetype = "Rectangle";
	
	public Rectangle(String color,double height,double width) {
		super(color,shapetype);
		this.height = height;
		this.width  = width;
			
	}
	
	@Override
	public double calculateArea() {
		super.area = this.height*this.width;
		return super.area;
	}
	
	@Override
    public double calculatePerimeter() {
		
		this.perimeter = (2*this.width)+(2*this.height);
		super.perimeter = this.perimeter ;
		return super.perimeter;
	}
	
	@Override
	public void drawShape() {
			
	    	System.out.println("This shape is "+super.type);
	}
	  
    public void displayDetail() {
		
    	System.out.println("This shape Color is :"+super.color);
	}
	
	

}
