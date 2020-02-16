import java.util.Scanner;

class SumOfEvenOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int n = sc.nextInt();

		int sum1=0,sum2=0,i=1,results=0;

		while(i<=n)
		{
			if(i%2==0)
				sum1 = sum1 +i;
			else
				sum2 = sum2 + i;

			results = sum1+sum2;
			i++;
		}
		System.out.println(results);
	}
}