package com.shape.oopLab1;
public class RunMain{
	
	public static void main(String[] args) {
		
		Circle shape1 = new Circle("Red",4);
		shape1.display();
		System.out.println(" Calculate Area : "+shape1.calculateArea());
		System.out.println(" Calculate Area : "+shape1.calculatePerimeter());
		
		
		Rectangle shape2 = new Rectangle("Red",4,9);
		shape2.display();
		System.out.println(" Calculate Area : "+shape2.calculateArea());
		System.out.println(" Calculate Area : "+shape2.calculatePerimeter());
		
		Square shape3 = new Square("Red",4,4);
		shape3.display();
		System.out.println(" Calculate Area : "+shape3.calculateArea());
		System.out.println(" Calculate Area : "+shape3.calculatePerimeter());
		
		Triangle shape4 = new Triangle("Red",4,6);
		shape4.display();
		System.out.println(" Calculate Area : "+shape4.calculateArea());
		System.out.println(" Calculate Area : "+shape4.calculatePerimeter());
		
		
		
		
		
	}

}
