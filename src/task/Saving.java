package task;

import java.util.ArrayList;

class Saving extends Account {

	 private float irate;
	 
	 public Saving(int ir) 
	 {
			accNoCount++;
			accNo = accNoCount;
			
			irate=ir;
			transactions = new ArrayList<Transaction>();
			deductions = new ArrayList<Deduction>();
			balance=0;
			date=java.time.LocalDate.now();	
	 }
	 public float getInterestRate() 
	 { 
		 return irate;
	 }
	 
	 public void setInterestRate(int ir) 
	 {
		 irate=ir;
	 }
	 
	 public double calculateZakat()
	 {
		 if (balance >= 20000)
			 return((balance*2.5)/100);
		 else 
		 {
			 System.out.println("~- not enough balance for eligibillity of zakaat -~");
			 return 0;
		 }
		 
	 }
	 
	 public void collectZakat() 
	 {
		double zakat=this.calculateZakat();
		balance=balance-zakat;
		 
		String temps="Zakaat";
		Deduction temp=new Deduction(zakat,temps);
		deductions.add(temp);
	 }
	 
	 public double calculateInterest() 
	 {
		 double interest=balance*irate/100;
		 System.out.println("Interest: " + interest);
		 return interest;
	 }
	 
	 public void addInterest() 
	 {
		 double interest=calculateInterest();
		 
		 balance=balance+interest;
		 System.out.println("Interest has been added, New amount: " + balance);
	 }
}
