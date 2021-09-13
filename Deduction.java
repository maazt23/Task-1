package task;

public class Deduction
{
	private double amount;
	private String ttype;
	private java.time.LocalDate date;
	private java.time.LocalTime time;

	public Deduction(double a,String t)
	{
		amount=a;
		ttype=t;
		date=java.time.LocalDate.now();
		time=java.time.LocalTime.now();
	}
	
	public void displayInfo() 
	{
		System.out.println("Deduction Type: " + ttype);
		System.out.println("Deduction Amount: " + amount);
		System.out.println("Date: " + date);
		System.out.println("Time: " + time);	  
	}

}
