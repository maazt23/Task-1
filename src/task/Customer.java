package task;

import java.util.ArrayList;

public class Customer
{
	
	private String name;
	private int phone;
	private String address;
	private Saving savingsAcc;
	private Checking checkingsAcc;
	
	
	public Customer(String n, int p, String add, int scheck, int ir, int ccheck)// Name, Phone, Address, SavingCheck, InterestRate, CheckingCheck
	{
		name = n;
		phone = p;
		address = add;
		
		if(scheck==1) 
		{
			savingsAcc=new Saving(ir);
		}
		else 
		{
			savingsAcc=null;
		}
		
		if(ccheck==1) 
		{
			checkingsAcc=new Checking();
		}
		else 
		{
			checkingsAcc=null;
		}	
	}
	
	public void createSavingsAcc(int ir) 
	{
		if(savingsAcc!=null)savingsAcc=new Saving(ir);
		else System.out.println("~Error~ Savings Account Already Exists.");
	}
	
	public void createCheckingsAcc() 
	{
		if(checkingsAcc!=null)checkingsAcc=new Checking();
		else System.out.println("~Error~ Checkings Account Already Exists.");
	}
	
	public void printStatement() 
	{
		System.out.println("Customer Name: " + name);
		System.out.println("Phone Number: " + phone);
		System.out.println("Address: " + address);
		if(savingsAcc!=null)savingsAcc.printStatement();
		if(checkingsAcc!=null)checkingsAcc.printStatement();
	}
		
}
