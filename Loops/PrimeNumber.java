
// Write a java program to Check user enter number is Prime or Not!!!!

import java.util.Scanner;

class PrimeNumber
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");

		int N = sc.nextInt();

		int i=1, Count = 1;   //Count= 0; 

		while(i<=N/2)       // while(i <= N) ==> Its Take More Time
		{
			if(N%i==0)
				Count++;
			
				if(Count> 2)
					break;

			i++;

		}
			if(Count==2)

		 		System.out.println(N+ " is Prime number");
		 	else
		 		System.out.println(N+ " is not Prime number");

	}
}