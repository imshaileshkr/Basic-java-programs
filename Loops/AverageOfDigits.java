
/** WJP to display and cal. the average of their individual digits!!!!*/

import java.util.Scanner;

class AverageOfDigits
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int n = sc.nextInt();

		int sum = 0, count =0;

		do {
			int r = n%10;
				sum=sum+r;

				count++;

				n=n/10;
				

		}
		while(n!=0);

			int average = sum/count;
			System.out.println("Average of Their Digits is "+average);
	}
}