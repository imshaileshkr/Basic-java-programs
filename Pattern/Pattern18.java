class Pattern18
{

public static void main(String[] args) 
{
	

	int n =9,sp=n/2,st=1,k=1;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=sp;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=st;j++)
	{
		if(i%2==0)
	{
		System.out.print("*");
	}
	else
	{
		System.out.print(k++);
	}
}
	System.out.println();
}
}
}