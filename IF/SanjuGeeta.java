
/*  Read no from the user if  that no is divisible by only 3 so Print 'Sanju.
 	If no is divisible by only 5 Print "Geeta"
	If No divid=sible by both no Than print "Sanju weds Geeta".
	Other wise print Breakup. */

import java.util.Scanner;

class SanjuGeeta
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");

		int a = sc.nextInt();

		if(a%3==0 && a%5!=0)
			System.out.println("Sanju");

		else if (a%5==0 && a%3!=0)
			System.out.println("Geeta");

		else if (a%5==0 && a%3==0)
			System.out.println("Sanju Weds Geeta");

		else
			System.out.println("Breakup");

	}
}