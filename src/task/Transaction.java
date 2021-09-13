package task;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class Transaction 
{
	private double amount;
	private String ttype;
	private java.time.LocalDate date;
	private java.time.LocalTime time;

	public Transaction(double a,String t)
	{
		amount=a;
		ttype=t;
		date=java.time.LocalDate.now();
		time=java.time.LocalTime.now();
	}
	
	public void displayInfo() 
	{
		System.out.println("Transaction Type: " + ttype);
		System.out.println("Transaction Amount: " + amount);
		System.out.println("Date: " + date);
		System.out.println("Time: " + time);	  
	}

}
