import java.util.Scanner;

class MainP5
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Number");

		int a = sc.nextInt();
		int b = sc.nextInt();

			if(a==b)
			System.out.println("Both are Same Number");

			else if(a>b)
				System.out.println(b+ "  is least Number among them");
		
			else
				System.out.println(a+ "  is least among them");

	}
}