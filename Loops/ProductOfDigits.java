
//WJP to cal product of digits in your Number!!!!!!!!

import java.util.Scanner;

class ProductOfDigits
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number");

		int n = sc.nextInt();
		int product = 1;
		do{
			int r= n%10;
			product= product*r;

			n=n/10;
		}
		while(n!=0);
			System.out.println("Product of Digits " +product);
	}
}
