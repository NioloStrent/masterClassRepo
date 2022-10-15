package com.keith.assertthat;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.keith.external.Rectangle;

public class Ex4 {

	
	@Test
	
	public void testMatchers() {
		
		Rectangle rectangle = new Rectangle(4.0, 3.0);
		
		assertEquals(rectangle.getLength(),4.0, 0);
		
		// assertThat(rectangle.getLength(), is(4.0)); -- Creates a strikethrough in the corresponding import statement.
		
		assertNotEquals(rectangle.getLength(),3.0,0);
		
		// assertThat(rectangle.getLength(), is(not(3.0))); -- Creates a strikethrough in the corresponding import statement.
		
		System.out.println("Ex4: Matcher test works.");
	}
}
