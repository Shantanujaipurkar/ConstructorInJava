package Constructor;

public class customer {

	public static void main(String[] args) {
		
		//creating the obj of the class Account
		
		Account user=new Account(12, "saving", "ram", "ram@email.com", 23, 200);
		
		
		
		//calling the  public deposit method method in account using the object name
		
		user.depositamount(100);
		
		
		//calling the  public withdrawal method method in account using the object name

		user.withdrawalamount(100);
		
		
		
	}

}
