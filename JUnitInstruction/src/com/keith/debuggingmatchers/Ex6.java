package com.keith.debuggingmatchers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.keith.external.Rectangle;

public class Ex6 {

	@Test
	
	public void testMatcher1() {
		
		Rectangle rectangle = new Rectangle(4.0, 3.0);
		
		assertTrue(rectangle.getLength()==3.0 || rectangle.getLength() == 2.0);
	}
	
	@Test
	
	public void testMatcher2() {
		
		Rectangle rectangle = new Rectangle(4.0,3.0);
		
		// assertThat(rectangle.getLength(), either(equalTo(3.0)).or(equalTo(2.0)));
	}
}
