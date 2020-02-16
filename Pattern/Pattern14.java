class Pattern14
{
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{ 
			int k=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=2*i-1;j++)
			{
				if(j%2==0)
				System.out.print("*");
			else
				System.out.print(k++);
			}
			System.out.println();
		}
	}
}