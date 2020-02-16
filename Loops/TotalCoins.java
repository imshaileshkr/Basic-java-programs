import java.util.Scanner;

class TotalCoins
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int n = sc.nextInt();

		int fc = n/5;
		System.out.println("Number of 5rs. Coin " +fc);

		int tc = (n%5/2);
		System.out.println("Number of 2rs. Coin " +tc);

		int oc = (n%5%2);
		System.out.println("Number of 1rs. Coin " +oc);

		System.out.println("Total Number of Coin " +(fc+tc+oc));
	}
}



	
		
