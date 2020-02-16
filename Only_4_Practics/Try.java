import java.util.Scanner;
class Try
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int n = sc.nextInt();

			for(int i=1; i<=n; i++)
			{
				for(int k=1;k<=i; k++)
					{
						System.out.print(k+ " ");
				}
				System.out.println();
		}


	}
}