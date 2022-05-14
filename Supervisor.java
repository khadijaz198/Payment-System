public class Supervisor extends Worker
{
	private double weeklyPay;
	private int numbOfWeeks;
	private double annualPay;
	private double bonus;

/**
   Constructs a supervisor with a given name, annual pay and weekly bonus.
   @param name the name of this staff
   @param pay the annual pay
   @param bonus the weekly bonus
 */
public Supervisor(String name, double annualPay, double bonus)
{
	setName(name);
	this.annualPay = annualPay;
	this.bonus = bonus;
}

@Override
public double weeklyPay(int hoursWorked)
{
	numbOfWeeks = 52;
	double pay = (annualPay/numbOfWeeks) + this.bonus;
	return pay; 
}

}
