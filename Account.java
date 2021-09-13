package task;
import java.util.*;
import java.util.ArrayList;

public abstract class Account 
{
	protected static int accNoCount=0;
	protected int accNo;
	protected java.time.LocalDate date;
	protected double balance;
	protected ArrayList<Transaction> transactions;
	protected ArrayList<Deduction> deductions;
	
	public double checkBalance() 
	{
		System.out.print("Balance: " + balance);
		return balance;	
	}
	
	public void makeDeposit(double dep)
	{
		balance=balance+dep;
		System.out.println(dep + "$ has been deposited.");
		
		String temps="Deposit";
		Transaction temp=new Transaction(dep,temps);
		transactions.add(temp);
	}
	
	public void makeWithdrawal(double wd)
	{
		balance=balance-wd;
		System.out.println(wd + "$ has been withdrawn.");
		
		String temps="Withdrawal";
		Transaction temp=new Transaction(wd,temps);
		transactions.add(temp);
	}
	
	public void printStatement() 
	{
		System.out.println("Account Number: " + accNo);
		System.out.println("Balance: " + balance);
		
		for(int i=0;i<transactions.size();i++) 
		{
			transactions.get(i).displayInfo();
		}
	}
	
	public void displayAllDeductions() 
	{
		System.out.println("Account Number: " + accNo);
		System.out.println("Balance: " + balance);
		
		for(int i=0;i<deductions.size();i++) 
		{
			deductions.get(i).displayInfo();
		}
	}
	
	public void transferAmount(double am,int accno)
	{
		balance=balance-am;
		System.out.println(am + "$ has been transferred to Account Number: " + accno);
		
		String temps="Transfer Given";
		Transaction temp=new Transaction(am,temps);
		transactions.add(temp);
	}
	
	public void recieveTransfer(double am,int accno)
	{
		balance=balance+am;
		System.out.println(am + "$ has been recieved from Account Number: " + accno);
		
		String temps="Transfer Recieved";
		Transaction temp=new Transaction(am,temps);
		transactions.add(temp);
	}
	
	
}
