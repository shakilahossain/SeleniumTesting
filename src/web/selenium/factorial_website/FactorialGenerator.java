package web.selenium.factorial_website;

import java.util.stream.LongStream;

public class FactorialGenerator {

	public static long calculateFactorial (Integer n) {
	    
		return LongStream.rangeClosed(1, n)
        .reduce(1, (long x, long y) -> x * y);
		
	}
	
	public static void main (String [] args) {
		long output = calculateFactorial(13);
		System.out.println(output);
	}
}
