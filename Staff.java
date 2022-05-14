/**
This class represents the Staff. A Staff worker is paid the same amount independent of the hours worked.
*/

public class Staff extends Worker
{
	private int numbOfWeeks;
	private double annualPay;
	
/**
   Constructs a staff worker with a given name and annual pay.
   @param name the name of this staff
   @param pay the annual pay
 */
public Staff(String name, double pay)
{
   setName(name);
   annualPay = pay;
}

//This portion of your code computes the pay for this category of worker.
@Override
public double weeklyPay(int hoursWorked)
{
	numbOfWeeks = 52;
	double pay = annualPay / numbOfWeeks;
	return pay;
}

}
