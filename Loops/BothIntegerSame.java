
/**WJP  to read two integer number from user and diplay both
are same if both the number sum of its digits are same otherwise not same!!*/

import java.util.Scanner;

class BothIntegerSame
{
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter First Number");
		int n1 = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Second Number");
		int n2 = sc2.nextInt();


		int sum1=0,sum2=0;
		int t1 = n1, t2=n2;
		do{
			int a= n1%10;
		
			sum1= sum1+a;
			n1=n1/10;
		}
		while(n1!=0);


		do{
			int b= n2%10;
		
			sum2 = sum2+b;
			n2=n2/10;
		}
		while(n2!=0);


		if(sum1==sum2)

			System.out.println(t1+ " and " +t2+ " : Both numbers are same");
		else
			System.out.println(t1+ " and " +t2+ " : Both numbers are not same");
}
	}