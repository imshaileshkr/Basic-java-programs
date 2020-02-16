
/** WJP to display how many Odd digits present in any Number!!!!!*/

import java.util.Scanner;

class OddDigits
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number");

		long n = sc.nextLong();

		long count = 0,i;

		do
		{
			long r = n%10;

			if(r%2!=0)
			count++;
			n=n/10; 

			
		}while(n!=0);

		System.out.println(count);
	}
}