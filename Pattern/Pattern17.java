
/*  A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A       */
    
class Pattern17{

public static void main(String[] args) {
	

	int n =9,sp=n/2,st=1;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=sp;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=st;j++)
	{
		System.out.print((char)(64+j)); // Few Change in Pattern16.java to find this Pattern
	}
	if(i<=n/2)
	{
		sp--;
		st=st+2;
	}
	else
	{
		sp++;
		st = st-2;
	}
	System.out.println();
}
}
}