package suhan.budhathoki;

public class Account{

	String accountNumber;
	double balance;
	String customerName;
	String customerEmail;
	String customerPhone;

	public Account(){
		this("0000000",100.00,"Default Customer Name", "customer@customer.com","(000)-000-0000");
		System.out.println("No Parameters Passed. Default Values Created to the new Account!!");
	}

	public Account(String accountNumber,double balance,String customerName,String customerEmail,String customerPhone){
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.customerName=customerName;
		this.customerEmail=customerEmail;
		this.customerPhone=customerPhone;
	}

	public void setAccountNumber(String accountNumber){
		this.accountNumber=accountNumber;
	}

	public void setbalance(double balance){
		this.balance=balance;
	}

	public void setCustomerInfo(String customerName,String customerEmail,String customerPhone){
		this.customerName=customerName;
		this.customerEmail=customerEmail;
		this.customerPhone=customerPhone;
	}

	public String getAccountNumber(){
		return accountNumber;
	}

	public double getBalance(){
		return balance;
	}

	public String getCustomerName(){
		return customerName;
	}

	public String getCustomerEmail(){
		return customerEmail;
	}

	public String getCustomerPhone(){
		return customerPhone;
	}

	public void depositFunds(double addFund){
		this.balance += addFund;
	}

	public void withdrawFunds(double decFund){
		if (this.balance>=decFund){
			this.balance-=decFund;
		}
		else{
			System.out.println("Insufficient Funds");
		}
	}

}