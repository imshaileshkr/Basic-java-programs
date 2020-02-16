import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int n = sc.nextInt();

		int rev =0, t=n;

		do
		{
			int r=n%10;
			rev = rev*10+r;

			n= n/10;
		}while(n!=0);

		if(rev==t)
			System.out.println(t+ " is palindrome");
		else 
			System.out.println(t+ " is not palindrome");
	}
}