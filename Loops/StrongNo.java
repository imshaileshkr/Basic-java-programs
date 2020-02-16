import java.util.Scanner;
public class StrongNo{
	public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Number");
			int n= sc.nextInt();
			int sum=0,t=n;

			do{
				int r=n%10;
				int f=1;
				while(r>1){
					f= f*r;
					r--;
				}
				sum =  sum+f;
				n= n/10;
			}while(n!=0);

			if(sum==t)
				System.out.println(t+" is Strong number");
			else
				System.out.println(t+" is not Strong number");


		}
	}
