package Constructor;

public class Account {
	
	private int accountNo;
	private String acounttype;
    private String custname;
    private String custemail;
    private int custage;
    private int balance;
    
    
    //calling the constructor and passing the paremeters to it.
    
    Account( int accountNo,String accounttype,String custname,String custemail,int  custage ,int balance)
    {
    	
    	//initalizing the parameters with this keyword
    	
    	this.accountNo=accountNo;
    	this.acounttype=accounttype;
    	this.custname=custname;
    	this.custemail=custemail;
    	this.custage=custage;
    	this.balance=balance;
    	
    	
    }
    
    //creating the  public method for deposit the money
    public void depositamount( int depositamount) {
    	
    	
    	this.balance=this.balance+depositamount;
    	
    	System.out.println("you have succesfully deposiated " +depositamount+" Rs. in your account .Now the current balance is " +balance+" Rs.");
    	
    }
    
    //creating the method for wuthdrawal the money form the account
    
    public void withdrawalamount(int withamount) {
    	
    	this.balance=this.balance-withamount;
    	
    	System.out.println("you have succesfully withdrawal " +withamount+" Rs. form your saving account .Now the total balance is "+balance +"Rs.");
    	
    }
    
    
    
	//generating the getters and setters for the construtor.


	public int getAccountNo() {
		return accountNo;
	}


	public String getAcounttype() {
		return acounttype;
	}


	public String getCustname() {
		return custname;
	}


	public String getCustemail() {
		return custemail;
	}


	public int getCustage() {
		return custage;
	}


	public int getBalance() {
		return balance;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public void setAcounttype(String acounttype) {
		this.acounttype = acounttype;
	}


	public void setCustname(String custname) {
		this.custname = custname;
	}


	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}


	public void setCustage(int custage) {
		this.custage = custage;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
    
	
	
	
	

}
