import java.util.Scanner;

class IsEvenOdd
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");

		int n = sc.nextInt();

		if(n/2*2==n)
			System.out.println(n+" :- Number Is Even");
		else
			System.out.println(n+" :- Number Is odd");
		
    }


}