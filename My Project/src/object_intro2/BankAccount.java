package object_intro2;

public class BankAccount {

	private String accountID;
	private String newAccountID;
	private double balance;
	private double newBalance;
	public BankAccount(){
		
	}
	
	public BankAccount(String accountID,double balance){
		this.accountID = accountID;
		this.balance = balance;
	}
	
	public void setAccountID(String newAccountID){
		accountID = newAccountID;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public String getAccountID(){
		return accountID;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit (double amount){
		balance = balance + amount;
	}
	public void withdrawal (double amount){
		balance = balance - amount;
	}
	public String toString(){
		String outputFormat = "ID: %s, Balance: %.2f";
		String returnedString = String.format(outputFormat, accountID, balance);
		return returnedString;
	}
}

