import java.util.Scanner;

class MainP9
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Number");

		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();

		if(m1<35 || m2<35 || m3<35 || m4<35);
			System.out.println("Result : Fail");
		else{
			double per = (m1+m2+m3+m4)/4.0;
			if(per>=80)
				System.out.println("Result : Distinction");	
			else if (per >= 60)
				System.out.println("Result : First Class");

			else if (per >= 50)
				System.out.println("Result : Second Class");
			else
				System.out.println("Result : Pass");

		}

	}
}