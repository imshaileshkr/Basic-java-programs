/*

      1
     0 1
    0 1 0             PRINTS !!!!!!!!!!
   1 0 1 0
  1 0 1 0 1
 0 1 0 1 0 1
0 1 0 1 0 1 0
*/


class Pattern13
{
	public static void main(String[] args) {
		int n=7,k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=2*i-1;j++)
			{
				System.out.print(k%2+ " ");
				k++;
			}
			System.out.println();
		}
	}
}