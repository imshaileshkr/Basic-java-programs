import java.util.Scanner;

class DayNumber
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Day Number");

		int dno = sc.nextInt();

		switch(dno)
		{
			case 1 : System.out.println("Sunday");
					break;
			case 2 : System.out.println("Monday");
						break;
			case 3 : System.out.println("Tuesday");
						break;
			case 4 : System.out.println("Wednesday");
						break;
			case 5 : System.out.println("Thrusday");
						break;
			case 6 : System.out.println("Friday");
						break;
			case 7 : System.out.println("Saturday");
					break;

			default : System.out.println("Invalid Day Number");

		}
	}
}