// Fabonacci Series Without using recursion


import java.util.*;
class Fabonacci{
	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Number to print Fabonacci series upto:");
		int c= sc.nextInt();
		System.out.print(n1+ " " +n2);
		for(i=2;i<c;i++)
		{
			n3=n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
		}
	}
}