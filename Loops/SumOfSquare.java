
/** WJP to cal. the sum of Square of individual digits*/

import java.util.Scanner;

class SumOfSquare
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int n = sc.nextInt();

		int sum1 = 0, sum2; //=0;

		do {
			int r = n%10;
				sum1=sum1+r*r;

				n=n/10;
				sum2 = n*n;

		}
		while(n!=0);
			System.out.println(sum1+sum2);
	}
}