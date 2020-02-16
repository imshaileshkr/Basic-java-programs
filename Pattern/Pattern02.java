/* n =2 --> *                **
			*	   n=4 --->	 **
							 **
							 **           */


import java.util.Scanner;
class Pattern02

{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n/2;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}