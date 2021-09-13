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
		
		Customer cust1=new Customer("Maaz",321994951,"Tariq DHA2",1,2,1);
		Customer cust2=new Customer("shwy",331994953,"Javed DHA2",1,5,1);
		Customer cust3=new Customer("Arhum",321444951,"AwaWawA DHA2",1,50,1);
		Customer cust4=new Customer("khaj",321994951,"TqwqW DHA2",1,45,1);
		Customer cust5=new Customer("meenu",321994951,"dfTVTfb DHA2",1,56,1);
		
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		customers.add(cust5);
		
		int choice = -1;
		System.out.println("0) Open Account, Close an account");
		System.out.println("1) Login to account");
		System.out.println("2) Specify Interest Rate");
		System.out.println("3) Display account details");
		System.out.println("4) Display account deductions");
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		
		switch(choice) 
		{
			case 0:
				int op=sc.nextInt();
				
				break;
			
			case 1:
				int user=sc.nextInt();
				int pass=sc.nextInt();
				
				break;
			
			case 2:
				int interest=sc.nextInt();
				
				break;
			
			case 3:
				
				break;
		
			case 4:
				
				break;
		};	
	}
	
	public void openAccount() 
	{
		Scanner sc= new Scanner(System.in); //System is in a standard input stream
		System.out.print("Enter first number- ");
		int a= sc.nextInt();
	}
	
	
}
