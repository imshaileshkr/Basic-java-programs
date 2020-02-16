import java.util.Scanner;

class DayMonth
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Month Number");

		int mno = sc.nextInt();

		switch(mno)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println("31 Days in this Month");
				break;

			case 4:
			case 6:
			case 9:
			case 11: System.out.println("30 Days in a this Month");
				break;

			case 2: System.out.println("Either 28 or 29 Days in this Month");
				break;

			default : System.out.println("Invalid Day Input");
		}
	}
}