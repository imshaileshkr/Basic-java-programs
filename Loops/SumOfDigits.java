
// WJP to cal. the Sum of digits in a number!!!!!!!!!!

import java.util.Scanner;

class SumOfDigits
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number");

		int n = sc.nextInt();
		int sum = 0;
		do{
			int r= n%10;
			sum= sum+r;

			n=n/10;
		}
		while(n!=0);
			System.out.println("Sum of Digits " +sum);
	}
}
