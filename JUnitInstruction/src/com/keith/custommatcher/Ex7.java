package com.keith.custommatcher;

import org.junit.jupiter.api.Test;

import com.keith.external.Rectangle;

public class Ex7 {

	@Test
	
	public void testMatchers() {
		
		Rectangle rectangle = new Rectangle(4.0,0.0);
		
		// assertThat(rectangle.getAspectRatio(), is(IsNotANumber.notANumber()));
	}
}
