package com.realestateapp;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class ApartmentRaterTest {

	@Test
	@Order(1)
	@ParameterizedTest(name = "price={0}, area={1}")
	void should_ReturnCorrectRating_When_CorrectApartment() {
		
	}
	
	@Test
	@Order(2)
	void should_ReturnErrorValue_When_IncorrectApartment() {
		
	}
	
	@Test
	@Order(3)
	void should_CalculateAverageRating_When_CorrectApartment() {
		
	}
	
	@Test
	@Order(4)
	void should_ThrowExceptionInCalculateAverageRating_When_EmptyApartmentList() {
		
	}

}
