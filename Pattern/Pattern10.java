
/*

1
23
456
7891
23456          Prints
789123
4567891
*/


class Pattern10
{
	public static void main(String[] args) {
		
	

int n=7,k=1;
for(int i=1;i<=n;i++)
{
	for(int j = 1; j<=i;j++)
	{
		System.out.print(k++ +"");
		if(k==10)
			k=1;
	}
System.out.println();
}

}
}