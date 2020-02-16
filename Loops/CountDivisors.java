
//  Write a java program to Count how many Divisors for N

import java.util.Scanner;

class CountDivisors
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");

		int N = sc.nextInt();

		int i=1, count = 1;   //Count= 0; 

		while(i <= N/2)       //while(i <= N) ==> Its Take More Time
		{
			if(N%i==0)
				count++;

			i++;

		}
		System.out.println(count);

	}
}