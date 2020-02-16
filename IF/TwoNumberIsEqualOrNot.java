
// Find the given Two number is Equal or not
import java.util.Scanner;

class TwoNumberIsEqualOrNot
{
	public static void main(String arg[])
	{
		// Create the Scanner class for taking the input from user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Number");
		
		// Taking two input fro user
		int a = sc.nextInt();
		int b = sc.nextInt();
			
			// Comparing the given number 
			if(a==b)
			System.out.println("Both are Same Number");

			else if(a>b)
				System.out.println(b+ "  is least Number among them");
		
			else
				System.out.println(a+ "  is least among them");

	}
}
