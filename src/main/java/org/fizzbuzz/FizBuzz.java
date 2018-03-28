package org.fizzbuzz;

public class FizBuzz {

	public static String execute(int number) {
		if(number != 0) {
			if(number % 15 == 0) {
				return "FizzBuzz";
			}else if(number % 3 == 0) {
				return "Fizz";
			} else if (number % 5 == 0) {
				return "Buzz";
			}
		}
		return String.valueOf(number);
	}

}
