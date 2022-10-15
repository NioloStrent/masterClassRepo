package com.keith.testmethod;

import org.junit.Test;

import com.keith.external.Rectangle;

public class Ex2 {
	
	@Test
	public void testFunction() {
		
		Rectangle rectangle = new Rectangle(4,3);
		
		double area = rectangle.getArea();
		
		assert area==12;
		
		System.out.println("Ex2: Rectangle area method works.");
		
	}
}
