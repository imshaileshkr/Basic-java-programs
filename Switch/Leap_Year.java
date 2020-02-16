
/* Read the input(in year) from the User and find the that year is Leap Year or Not */

import java.util.Scanner;

class Leap_Year
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year");

		int year = sc.nextInt();

		// To check User inter year is Leap Year or Not!


		/*if(year%400==0)
			System.out.println(year+ " is Leap Year");

		else if(year%4==0 && year%100!=0)
			System.out.println(year+ " is Leap Year");

		else
			System.out.println(year+ " is Not Leap Year");*/


			if(year%400==0 || (year%4==0 && year%100!=0))
				System.out.println(year+ " is Leap Year");

			else
				System.out.println(year+ " is Not Leap Year");
		
	}
}