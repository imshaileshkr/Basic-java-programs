//import java.util.Scanner;


//Print the Count how many prime number within 100.
class CountPrimeNumber
{
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int n = sc.nextInt();*/


		int n =1;
		while(n <=100)
		{
			int count =1, i=1;
			while(i<=n/2)
			{
				if(n%i==0)
					count++;
				if(count>2)
					break;
				i++;
			}
			if(count==2)
				System.out.println(n+ " is Prime Number");
		} 
	}
}