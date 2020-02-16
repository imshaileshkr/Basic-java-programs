
/*   PRINT                 * * * * * * * *
				n=4 --->   * * * * * * * *
						   * * * * * * * *
						   * * * * * * * *     Pattern. */


import java.util.Scanner;
class Pattern03

{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n*2;j++)
			{
				System.out.print(" * ");
			}
			System.o+ut.println();
		}

	}
}