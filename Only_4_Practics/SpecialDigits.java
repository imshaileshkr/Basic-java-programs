import java.util.Scanner;

class SpecialDigits
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A 2 Digits Number");

		int n = sc.nextInt();

		int d1,d2;
		d1= n%10;
		d2=n/10;
		 int sum = d1+d2 + d1*d2;
		 if(sum==n)
		 	System.out.println("SpecialDigis");
		 else
		 	System.out.println("Not A SpecialDigis");

	}
}