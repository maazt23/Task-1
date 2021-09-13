package task;

import java.util.ArrayList;

class Checking extends Account {
	private int freedep;
	
	public Checking() 
	{
		freedep=2;
		transactions = new ArrayList<Transaction>();
		deductions = new ArrayList<Deduction>();
		balance=0;
		date=java.time.LocalDate.now();	
	}
	
	public int getFreeDeposits() 
	{
		return freedep;
	}
	
	public void resetFreeDeposits() 
	{
		freedep=2;
	}
	
	public void makeDeposit(double dep)
	{
		int fee=0;
		if(freedep==0)fee=10;
		else --freedep;
		
		balance=balance+(dep+fee);
		System.out.println(dep + "$ has been deposited.");
		
		String temps="Deposit";
		Transaction temp=new Transaction(dep,temps);
		transactions.add(temp);
		
		temps="Transaction Fee";
		Deduction temp2=new Deduction(fee,temps);
		deductions.add(temp2);
	}
	
	public void makeWithdrawal(double wd)
	{
		int fee=0;
		if(freedep==0)fee=10;
		else --freedep;
		
		balance=balance-(wd+fee);
		System.out.println(wd + "$ has been withdrawn.");
		
		String temps="Withdrawal";
		Transaction temp=new Transaction(wd,temps);
		transactions.add(temp);
		
		temps="Transaction Fee";
		Deduction temp2=new Deduction(fee,temps);
		deductions.add(temp2);
	}
	
	public void transferAmount(double am,int accno)
	{ 
		int fee=0;
		if(freedep==0)fee=10;
		else --freedep;
		
		balance=balance-(am+fee);
		System.out.println(am + "$ has been transferred to Account Number: " + accno);
		
		String temps="Transfer Given";
		Transaction temp=new Transaction(am,temps);
		transactions.add(temp);
		
		temps="Transaction Fee";
		Deduction temp2=new Deduction(fee,temps);
		deductions.add(temp2);
	}
}
