import java.util.Scanner;

class WhileLoop
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The N Natural Number");

		int n = sc.nextInt();

		int i =1, sum=0;
		while(i<=n)
		{
			sum = sum +i;
			i++;
		}
		System.out.println(sum);
	}
}