import java.util.Scanner;

class MainP4
{

	public static void main(String arg[])

	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");

		int n = sc.nextInt();
		String st =n%2 == 0?"Even":"Odd";
		System.out.print(n+ "is" +st+ "Number");


		System.out.print("Thanks..");


	}
}                                             