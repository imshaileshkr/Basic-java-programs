/*1. Print the Divisors of N.
2. Print the Multiples of 3 within 100.
3. Print the Sum of Even No and Odd no within n.
4. Print the How many Leap years within 2019 (1 to 2019).
5. Print the Count how many prime number within 100.
6. Print the Calculate the product of N divisors.*/

public class Operators { 
	public static void main(String[] args) 
	{ 
		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 

		// precedence rules for arithmetic operators. 
		// (* = / = %) > (+ = -) 
		// prints a+(b/d) 
		System.out.println("a+b/d = " + (a + b / d)); 

		// if same precendence then associative 
		// rules are followed. 
		// e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f) 
		System.out.println("a+b*d-e/f = "
						+ (a + b * d - e / f)); 
	} 
} 
