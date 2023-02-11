/**
 * Author:			Devon Mizar
 * Date:			XX/XX/2023
 * File:			FILE NAME
 * Description:		Gets user data from BankApplication and does math through getters and setters.
 */

import java.util.Date;
public class CheckingAccount 
{

	//private data members
	private String uniqueID;
	private double accountBalance = 0;
	private double annualInterestRate = 0;
	private double deposit = 0;
	
	//constructors with default leading
	public CheckingAccount()
	{
		this.uniqueID = "null";
		this.accountBalance = 500;
		this.annualInterestRate = 0;
		new Date();
	}
	
	
	public CheckingAccount(String uniqueID, double accountBalance, double annualInterestRate, Date dateCreated)
	{
		this.uniqueID = uniqueID;
		this.accountBalance = accountBalance;
		this.annualInterestRate = annualInterestRate;	
		new Date();
	}
		
	//getters for private data members
	public String getUniqueID()
	{
		return uniqueID;
	}
	
	public double getAccountBalance()
	{
		return accountBalance;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	public Date getDateCreated()
	{
		Date dateCreated = new Date();
		return dateCreated;
	}
	
	public double getDeposit()
	{
		return deposit;
	}
	

	//setters for private data members
	public void setUniqueID(String uniqueID)
	{
		this.uniqueID = uniqueID;
	}
	
	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public void setDeposit(double deposit)
	{
		this.deposit = deposit;
	}
	
	//methods that are not constructor/getter/setter
	public double calcDeposit(double deposit)
	{
		return accountBalance += deposit;
	}
	
	public double calcInterestRate(double annualInterestRate)
	{
		return ( ( annualInterestRate / 365 ) / 100 ) * accountBalance;
	}
	
}
