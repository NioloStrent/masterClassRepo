package com.keith.typesofmatchers;

import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import com.keith.external.Rectangle;

public class Ex5 {

	
	@Test
	
	public void testMatcher1() {
		
		Rectangle rectangle = new Rectangle(4.0,3.0);
		
		// assertThat(Arrays.asList(rectangle.getLength(), rectangle.getBreadth(), hasItem(3.0));
	}
	
	@Test
	
	public void testMatcher2() {
		
		// assertThat("This is a test", containsString("test"));
	}
	
	@Test
	
	public void testMatcher3() {
		// assertThat("a good life", anyOf(containsString("good"), equalTo("had")));
	}
	
	@Test
	
	public void testMatcher4() {
		// assertThat("a good life", allOf(containsString("bad"), equalTo("Good");
	}
	
}
