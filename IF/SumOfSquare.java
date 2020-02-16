import java.util.Scanner;

class SumOfSquare
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int n = sc.nextInt();

		int sum = 0;

		do 
		{
			
			int r = n%10;
				sum = sum+r+r;

				n=n/10;
		} 
		while(n!=0);

			System.out.println(sum);
	}
}