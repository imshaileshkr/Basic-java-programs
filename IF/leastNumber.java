
/* Find the Least  among 3 number by usng Conditional Operator!!!!! */

import java.util.Scanner;

class LeastNumber
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Three Number");
		
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int result=(a<b && a<c) ? a : (b<c)? b:c;
				System.out.println("Least number is "+result);
			
	}
}