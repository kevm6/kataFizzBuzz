package org.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturnOne() {
		assertEquals("1",FizBuzz.execute(1));
	}
	
	@Test
	public void shouldReturnTwo() {
		assertEquals("2",FizBuzz.execute(2));
	}
	
	@Test
	public void shouldReturnFizzWithNumberThree() {
		assertEquals("Fizz",FizBuzz.execute(3));
	}
	
	@Test
	public void shouldReturnFizzWithNumberSix() {
		assertEquals("Fizz",FizBuzz.execute(6));
	}
	
	@Test
	public void shouldReturnBuzzWithNumberFive() {
		assertEquals("Buzz",FizBuzz.execute(5));
	}
	
	@Test
	public void shouldReturnFizzBuzzWithNumberFifteen() {
		assertEquals("FizzBuzz",FizBuzz.execute(15));
	}
	
	@Test
	public void shouldReturnFizzBuzzWithNumberThirty() {
		assertEquals("FizzBuzz",FizBuzz.execute(30));
	}
}
