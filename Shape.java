package com.shape.oopLab1;

public class Shape {

	String color;
	public double area;
	public double perimeter;
	String type;
	
	public Shape(String color,String shapetype) {
		this.color = color;
		this.type = shapetype;
	}
	
	public double calculateArea() {
		
		return 0;
	}
	
    public double calculatePerimeter() {
		
    	return 0;
	}
	
    public void drawShape() {
		
    	System.out.println("This shape is "+this.type);
	}
	
}
