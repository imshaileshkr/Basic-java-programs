class Pattern11
{
	public static void main(String[] args) {
		
	

int n=7;char ch ='A';
for(int i=1;i<=n;i++)
{
	for(int j = 1; j<=i;j++)
	{
		System.out.print(ch++ +" ");
		if(ch==91)
			ch='A';
	}
System.out.println();
}

}
}