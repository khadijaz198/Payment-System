import java.util.Scanner;

/**
 * This class is called the WorkerTest Class and provides the main method for
 * this program. This program demonstrates polymorphism by applying a method to
 * objects of different classes. The users are prompted to input
 * hours worked by each worker. Implemented using an array. The order of the
 * workers in the output is Contractor, Staff and Supervisor.
 */

public class WorkerTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		 Worker worker1 = new Contractor("Uche, Chukwu", 30);
		 Worker worker2 = new Staff("Ife, Oluwa", 52000);
		 Worker worker3 = new Supervisor("Peter, Waters", 104000, 50);
		
		 Worker[] workers = new Worker[3];
		 workers[0] = worker1;
		 workers[1] = worker2;
		 workers[2] = worker3;
		 
		 for(int i=0; i<3; i++) {
			 System.out.println("Enter the hours worked by " + workers[i].getName() + ": "); 
			 int hoursWorked = in.nextInt();
			 System.out.println("Total Pay for this worker is: " + workers[i].weeklyPay(hoursWorked)); 
			 System.out.println();
		 }
	}
}

