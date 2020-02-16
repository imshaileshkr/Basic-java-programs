// Write a Java Program to Display Fuzz if No is divisible by 3
// print 


//import java.util.Scanner;

class FuzzBuzz
{
	public static void main(String[] args) {
		
		/**Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");

		int n = sc.nextInt();*/

		for(i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
				System.out.println("Fuzz and Buzz");
			else if(i%3==0)
				System.out.println("Fuzz");
			else if(i%5==0)
				System.out.println("Buzz");
		}
	}
}