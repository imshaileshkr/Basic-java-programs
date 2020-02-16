import java.util.Scanner;

class MainP8
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Number");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int big = (a>b && a>c) ? a : (b>c) ? b : c;
		System.out.println(big);
	}
}
