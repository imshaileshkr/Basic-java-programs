
public class SavingAccount extends Account{
	public SavingAccount(){
		System.out.println("SavingAccount");
	}
	public static void main(String args[]){
		System.out.println("Main Start");
		SavingAccount sa = new SavingAccount();
		System.out.println("Main Ends");
	}
}


