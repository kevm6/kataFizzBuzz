package org.fizzbuzz;

public class FizBuzz {

	public static String execute(int number) {
		if(number % 3 == 0)
			return "Fizz";
		return String.valueOf(number);
	}

}
