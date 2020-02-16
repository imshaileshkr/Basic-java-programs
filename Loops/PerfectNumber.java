
// check the User enter number is **Perfect Number** or not !!!!!

import java.util.Scanner;

class PerfectNumber
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();

		int sum = 0, i =1;

		while(i <= n/2)
		{
			if(n%i == 0)
				sum = sum+i;
			i++;
		}
		if(sum==n)
			System.out.println(n+ " Is Perfect Number");
		else
			System.out.println(n+ " Is Not Perfect Number");


	}
}