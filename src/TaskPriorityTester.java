/**
 * This application class tests the methods from Process and Task classes 
 * @author Chris Burkhead
 *@version 0.1
 *Programming Project 2
 *Summer 2022
 */
public class TaskPriorityTester {

	public static void main(String[] args) {
		
		//initializing new Tasks, their priority and statuses
		Task a=new Task("Dishes", Priority.MED_PRIORITY, Task.Status.NOT_STARTED);
		Task b=new Task("Laundry", Priority.MAX_PRIORITY, Task.Status.IN_PROCESS);
		Task c=new Task("Mopping", Priority.MIN_PRIORITY, Task.Status.COMPLETE);
				
		//Printing toString for each Task to confirm initialization
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println();
				
		//Implementing the compareTo method to compare each task against the other based on priority.
		System.out.println("Dishes has a "+a.compareTo(b)+" priority when compared to Laundry");
		System.out.println("Dishes has a "+a.compareTo(c)+" priority when compared to Mopping");
		System.out.println("Laundry has a "+b.compareTo(c)+" priority when compared to Mopping");
				
		//initializing new Process and their priority.
		Process d=new Process("Defrag Harddrive", Priority.MIN_PRIORITY);
		Process e=new Process("Run Virus Scan", Priority.MAX_PRIORITY);
		Process f=new Process("Install Updates", Priority.MAX_PRIORITY);
				
		//Printing toString for each Process to confirm initialization
		System.out.println();
		System.out.println(d.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println();
				
		//Implementing the compareTo method to compare each Process against the other based on priority.
		System.out.println("Defrag Harddrive has a "+d.compareTo(e)+ " priority when compared to Run Virus Scan");
		System.out.println("Defrag Harddrive has a "+d.compareTo(f)+ " priority when compared to Install Updates");
		System.out.println("Run Virus Scan has a "+e.compareTo(f)+" priority when compared to Install Updates");
				
		}//end mains

}//end class
	

