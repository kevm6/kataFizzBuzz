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
	public void shouldReturnFizz() {
		assertEquals("Fizz",FizBuzz.execute(3));
	}
}
