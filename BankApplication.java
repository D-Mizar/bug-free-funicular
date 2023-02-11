/**
 * Author:			Devon Mizar
 * Date:			XX/XX/2023
 * File:			FILE NAME
 * Description:		Asks user for uniqueID, account balance, and annual interest rate to complete
 * 					a banking application that allows deposits, and viewing account information.
 */
import java.util.Scanner;

public class BankApplication 
{		
	public static void main(String[] args)
	{
			
		String uniqueID;
		double accountBalance = 0;
		double annualInterestRate = 0;
		double deposit = 0;
		int answer = 0;

		Scanner input = new Scanner(System.in);
		CheckingAccount ca = new CheckingAccount();
		
		//Asks user for account number
		System.out.println("Welcome to Banking App");
		System.out.println("Please enter the Unique ID: ");
		uniqueID = input.nextLine();
		
			//validation check for uniqueID
			while(!(uniqueID.length() >= 4))
			{
				System.out.println("Error! Account number must be at least 4 characters long.");
				System.out.println("Please enter the account number: ");
				uniqueID = input.nextLine();
			}
		
		//Asks user for initial balance
		System.out.println("Please enter the account balance: ");
		accountBalance = input.nextDouble();
		
			
			//validation check for accountBalance
			while(!(accountBalance >= 500))
			{
				System.out.println("Error! Initial balance must be at least $500.");
				System.out.println("Please enter the initial balance: ");
				accountBalance = input.nextDouble();
			}
		
		//Asks user for annual interest rate
		System.out.println("Please enter the annual interest rate: ");
		annualInterestRate = input.nextDouble();
		
		//Options menu
		System.out.println("*************************");
		System.out.println("\tOPTIONS");
		System.out.println("*************************");
		System.out.println("1. Deposit");
		System.out.println("2. View Daily Interest Rate");
		System.out.println("3. View Account Details");
		System.out.println("4. Exit");
		answer = input.nextInt();
		
			//validation check for answer on options menu
			while(answer > 4 || answer <= 0)
			{
				System.out.println("ERROR! Choice must be between 1 - 4. Please try again. ");
				answer = input.nextInt();
			}
		
			//Deposit
			if(answer == 1)
			{
				System.out.println("Enter the deposit amount: ");
				deposit = input.nextDouble();
				
				//validation check for deposit
				while(deposit <=0)
				{
					System.out.println("Deposit must be greater than 0. Please try again");
					deposit = input.nextDouble();
				}
				
				//displays new balance after deposit + accountBalance
				System.out.println("New Balance: $" + ca.calcDeposit(deposit));
				System.out.println();
				
				//Options menu
				System.out.println("*************************");
				System.out.println("\tOPTIONS");
				System.out.println("*************************");
				System.out.println("1. Deposit");
				System.out.println("2. View Daily Interest Rate");
				System.out.println("3. View Account Details");
				System.out.println("4. Exit");
				answer = input.nextInt();
				
				//validation check for answer on options menu
				while(answer > 4 || answer <= 0)
				{
					System.out.println("ERROR! Choice must be between 1 - 4. Please try again. ");
					answer = input.nextInt();
				}
			}
			
			//View Daily Interest Rate
			if(answer == 2)
			{
				//displays dailyInterestRate
				double dailyInterestRate = Math.round(ca.calcInterestRate(annualInterestRate * 100));
				System.out.println("Daily Interest Rate: $" + dailyInterestRate / 100);
				
				//Options menu
				System.out.println("*************************");
				System.out.println("\tOPTIONS");
				System.out.println("*************************");
				System.out.println("1. Deposit");
				System.out.println("2. View Daily Interest Rate");
				System.out.println("3. View Account Details");
				System.out.println("4. Exit");
				answer = input.nextInt();
				
				//validation check for answer on options menu
				while(answer > 4 || answer <= 0)
				{
					System.out.println("ERROR! Choice must be between 1 - 4. Please try again. ");
					answer = input.nextInt();
				}
			}
			
			//View Account Details
			if(answer == 3)
			{
				//display account details
				double dailyInterestRate = Math.round(ca.calcInterestRate(annualInterestRate * 100));
				System.out.println("Account Unique ID: " + ca.getUniqueID());
				System.out.println("Account Creation Date/Time: " + ca.getDateCreated());
				System.out.println("Balance: $" + ca.getAccountBalance());
				System.out.println("Daily Interest: $" + dailyInterestRate / 100);
				System.out.println();
				
				//Options menu
				System.out.println("*************************");
				System.out.println("\tOPTIONS");
				System.out.println("*************************");
				System.out.println("1. Deposit");
				System.out.println("2. View Daily Interest Rate");
				System.out.println("3. View Account Details");
				System.out.println("4. Exit");
				answer = input.nextInt();
				
				//validation check for answer on options menu
				while(answer > 4 || answer <= 0)
				{
					System.out.println("ERROR! Choice must be between 1 - 4. Please try again. ");
					answer = input.nextInt();
				}
				
			}
			
			//Exit
			if(answer == 4)
			{
				System.out.println("Program exiting...");
				System.exit(0);
			}
		input.close();
	}

}
