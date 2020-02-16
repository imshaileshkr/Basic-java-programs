
import java.util.Scanner;

class MultipleOf3
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");

		int n = sc.nextInt();

		int i=1 ;

		while(i<=n)
		{
			if(i%3==0)
				System.out.println(i);
			i++;
		}
		


	}
}