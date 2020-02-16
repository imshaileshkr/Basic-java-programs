
/*    1
     21
    321
   4321
  54321  */

class Pattern07
{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}