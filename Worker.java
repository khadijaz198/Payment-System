/**
THIS IS SUPERCLASS NAMED WORKER.
A worker has a name and a method for computing weekly payment.
*/

public class Worker
{
private String name;

/**
   Constructs a worker with an empty name.
*/
public Worker()
{
   name = "";
}

/**
   Sets the name of this worker.
   @param workerName the new name 
*/
public void setName(String workerName)
{
   name = workerName;
}

/**
   Gets the name of this worker.
   @return the name 
*/
public String getName()
{
   return name; 
}

/**
   This portion of code computes the pay for one week of work done by the worker.
   @param hoursWorked the number of hours worked in the week
   @return the pay for the given number of hours
*/
public double weeklyPay(int hoursWorked)
{
   return 0; 
}
}

