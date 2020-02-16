import java.util.Scanner;

class HelpPeople
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Product Name");

		String name = sc.nextLine();

		System.out.println("Product Price");

		double price = sc.nextDouble();

		System.out.println("Money");

		double money = sc.nextDouble();
		double a,b;
		a = money/price;

		System.out.println("You can Purchase "+a);

		b = money%price;
		System.out.println("You have to collect the change Rs. "+b);

	}
}