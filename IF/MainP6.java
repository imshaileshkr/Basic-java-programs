import java.util.Scanner;
class MainP6
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int a = sc.nextInt();
		

		if(a % 10 ==0)
			System.out.println(a+ "  Is Multiple Of 10");

		else
			System.out.println(a+ "  Is Not Multiple Of 10");



	}
}