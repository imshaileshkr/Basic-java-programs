/*  1
    1 7
    1 7 12
    1 7 12 16
    1 7 12 16 19
    1 7 12 16 19 21
    1 7 12 16 19 21 22 */

class Pattern15
{
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{ 
			int k=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k=k+(n-j);

			}
			System.out.println();
		}
	}

}