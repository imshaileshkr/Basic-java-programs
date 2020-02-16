// WJP to check your number is Armstrong no or Not!!!!!
// Armstrong means 

import java.util.Scanner;

class ArmstrongNumber
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number");

		int n = sc.nextInt();
		int  sum=0,t=n;
		do{
			int r= n%10;
			sum=sum+r*r*r;

			n=n/10;
		}
		while(n!=0);
			if(sum==t)
				System.out.println("Armstrong : " +sum);
			else
				System.out.println("Not Armstrong : " +sum);

	}
}