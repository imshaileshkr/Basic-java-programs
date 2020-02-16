import java.util.Scanner;

class MainP7
{
	public static void main(String agr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Day number:");

		int Day = sc.nextInt();

		if(Day == 1)
			System.out.println("Sunday");

		else if(Day == 2)
			System.out.println("Monday");
		else if(Day == 3)
			System.out.println("Tuesday");
		else if(Day == 4)
			System.out.println("Wednesday");
		else if(Day == 5)
			System.out.println("Thrusday");
		else if(Day == 6)
			System.out.println("Friday");
		else if(Day == 7)
			System.out.println("Saturday");
		else
			System.out.println("Invalid Input");

	}
}