import java.util.Scanner;

class FindOddEvenNumber
{

	public static void main(String arg[])

	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		
		// Taking input from user
		int n = sc.nextInt();
		
		// Comparing and assinging Even or Odd to String st variable--------
		String st =n%2 == 0?"Even":"Odd";
		
		// Printing the output----------------------
		System.out.print(n+ "is" +st+ "Number");


		System.out.print("Thanks..");


	}
}                                             
