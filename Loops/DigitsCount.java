
//WJP to count homy many digits in your number!!!!!!!!!!

import java.util.Scanner;

class DigitsCount
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number");

		int n = sc.nextInt();
		int count=0;
		do{
			int r= n%10;
		

			n=n/10;
			count++;
		}
		while(n!=0);
			System.out.println("Number of digits " +count);
}
	}
