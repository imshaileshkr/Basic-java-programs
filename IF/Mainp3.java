import java.util.Scanner;

class MainP3
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		

		if(n/2*2==n)
		System.out.println(n+ " is even Number");
		else
		System.out.println(n+ " is Odd Number");

		System.out.println("THANK YOU..");



	}
}