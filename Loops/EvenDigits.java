

/** WJP to display how many Even digits present in any Number!!!!!*/


import java.util.Scanner;

class EvenDigits
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number");

		int n = sc.nextInt();

		int count = 0,i;

		do
		{
			int r = n%10;

			if(n%2==0)
			 count++;

			n=n/10;

			
		}while(n!=0);

		System.out.println(count);
	}
}