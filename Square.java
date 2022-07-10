package com.shape.oopLab1;

public class Square extends Shape{

	double side;
	
	public Square(String color,double side) {
		super(color,"Square");
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		super.area = this.side*this.side;
		return super.area;
	}
	
	@Override
    public double calculatePerimeter() {
		super.perimeter = (2*this.side)+(2*this.side);
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
