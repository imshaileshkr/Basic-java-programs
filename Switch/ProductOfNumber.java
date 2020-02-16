
// Print the Product of N natural Number !!!!!!

import java.util.Scanner;

class ProductOfNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The N Natural Number");

		int n = sc.nextInt();

		int i =1, product = 1;
		while(i<=n)
		{
			product = product * i;
			i++;
		}
		System.out.println(n+ "!= " +product);
	}
}