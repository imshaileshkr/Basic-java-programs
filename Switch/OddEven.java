import java.util.Scanner;

class OddEven
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int n = sc.nextInt();

		switch(n%2)
		{
			case 1 : 
				System.out.println(n+ " Is Odd Number");

			case 0 : 
				System.out.println(n+ " Is Even Number");
		}
	}
}