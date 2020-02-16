import java.util.Scanner;
import java.util.Random;

class GuessGame
{
	public static void main(String agr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess number Between 0 To 9");
		int un = sc.nextInt();

		Random rd = new Random();
		int rn = rd.nextInt(10);

		if(rn==un)
			System.out.println("Your guess is correct");

		else
			System.out.println("Your guess is incorrect is was "+rn);

	}
}