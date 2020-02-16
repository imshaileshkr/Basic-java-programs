

//Write a Java program to Count How many numbers Divisible by 5,7 are with 100 !!!!!!

import java.util.Scanner;

class DivisibleBy
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");

		int n = sc.nextInt();

		int i= 1 ,count = 0;

		while(i <=n/2)
		{
			if(n%5==0 && n%7==0)
				count++;
			i++;		
		}
			System.out.println(count);
	}
}