
//Fabonacci Series using recursion

//import java.util.*;
class FabonacciWithRec{

	static int n1=0,n2=1,n3=0;
	static void printFabonacci(int count)
	{


		if (count>0) 
		{   
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFabonacci(count-1);
		}
     }
	public static void main(String[] args)
	 {
		int count =10;
		//Scanner sc =  new Scanner(System.in);
		//System.out.println("Enter Number to print Fabonacci series upto:");
		//int count= sc.nextInt();
		System.out.print(n1+ " " +n2);
		printFabonacci(count-2);
	  }
}