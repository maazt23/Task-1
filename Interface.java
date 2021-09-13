package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface
{
	public static void main(String[] args)  
	{  
		/*
		 * Scanner sc= new Scanner(System.in); //System.in is a standard input stream
		 * System.out.print("Enter first number- "); int a= sc.nextInt();
		 * System.out.print("Enter second number- "); int b= sc.nextInt();
		 * System.out.print("Enter third number- "); int c= sc.nextInt(); int d=a+b+c;
		 * System.out.println("Total= " +d);
		 */
		ArrayList<Customer> customers=new ArrayList<Customer>();
		// Name, Phone, Address, SavingCheck, InterestRate, CheckingCheck
		
		Customer cust1=new Customer("Maaz",321994951,"Tariq DHA2",1,22,1);
		Customer cust2=new Customer("shwy",331994953,"Javed DHA2",1,5,1);
		Customer cust3=new Customer("Arhum",56444951,"AwaWawA DHA2",1,50,1);
		Customer cust4=new Customer("khaj",456994951,"TqwqW DHA2",1,45,1);
		Customer cust5=new Customer("meenu",3594951,"dfTVTfb DHA2",1,56,1);
		Customer loggedin=new Customer(" ",00000,"",0,0,0);
		
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		customers.add(cust5);
		
		int choice = 10;
		System.out.println("1) Create Account");
		System.out.println("2) Login to account");
		System.out.println("3) Specify Interest Rate");
		System.out.println("4) Display account details");
		System.out.println("5) Display account deductions");
		System.out.println("0) Exit");
		
		Scanner sc = new Scanner(System.in);
		

		if(choice!=0) 
		{
			choice = sc.nextInt();
		switch(choice) 
		{
			
			case 1:
				
				System.out.println("Enter Name: ");
				String name=sc.nextLine();
				
				System.out.println("Enter Phone: ");
				int phone=sc.nextInt();
				
				System.out.println("Enter Address: ");
				String address=sc.nextLine();
				
				System.out.println("Do you want a savings account? ");
				int sch=sc.nextInt();
				
				System.out.println("Set interest rate: ");
				int ir=sc.nextInt();
				
				System.out.println("Do you want a checkings account? ");
				int cch=sc.nextInt();
				
				Customer tempy=new Customer(name,phone,address,sch,ir,cch);
				customers.add(tempy);
				
				break;
			
			case 2:
				int accnum=sc.nextInt();
				for(int i=0;i<customers.size();i++) 
				{
					if(accnum==customers.get(i).getAccNo())loggedin=customers.get(i);
				}
				break;
			
			case 3:
				int interest=sc.nextInt();
				loggedin.savingsAcc.setInterestRate(interest);
				break;
			
			case 4:
				loggedin.printStatement();
				
				break;
		
			case 5:
				if(loggedin.savingsAcc!=null) 
				{
					loggedin.savingsAcc.displayAllDeductions();
				}
				if(loggedin.checkingsAcc!=null)
				{
					loggedin.checkingsAcc.displayAllDeductions();
				}
				break;
				
		};
		}
	}
	
	public void openAccount() 
	{
		Scanner sc= new Scanner(System.in); //System is in a standard input stream
		System.out.print("Enter first number- ");
		int a= sc.nextInt();
	}
	
	
}
