
/* PRINT               1 1 1 1 1           1 1 1
                       2 2 2 2 2 , IF N=3  2 2 2 
             IF N= 5   3 3 3 3 3           3 3 3 
             		   4 4 4 4 4 
             		   5 5 5 5 5          PATTERN */

import java.util.Scanner;
class Pattern05

{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}

	}
}