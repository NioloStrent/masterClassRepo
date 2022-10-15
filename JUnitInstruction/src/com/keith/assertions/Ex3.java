package com.keith.assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import com.keith.external.Rectangle;

public class Ex3 {

	@Test
	
	public void testCondition() {
		
		Rectangle rectangle = new Rectangle(4,3);
		
		double area = rectangle.getArea();
		
		assertEquals(area,12,0);
		
		assertFalse(area > 15);
		
		assertTrue(area + 2 < 15);
	}
}
