/**
This code in this file is for the Contractor Class. A Contractor is a worker who is paid for every hour worked.
*/

public class Contractor extends Worker
{
	private double weeklyPay;
	private double contractWage;

/**
   This portion of your code constructs an hourly paid contractor with a given name and weekly wage.
   @param name the name of this contractor
   @param wage the contract wage per hour 
*/

public Contractor (String name, double wage) {
	setName(name);
	contractWage = wage;
}


@Override
public double weeklyPay(int hoursWorked)
{
   double pay = hoursWorked * contractWage;

// In this part of your code, an overtime amount is added if the Contractor works for more than 40 hours a week.
// Review this portion of code carefully to include the code to fully satisfy this condition.
  
// SOME CODE GOES HERE BEFORE THE CODE BELOW:
   double overtimePay = 0;
   if (hoursWorked > 44) {
	   overtimePay = (hoursWorked - 44) * 1.5 * contractWage;
       pay += overtimePay;
   }
       
   
   return pay;
}
}