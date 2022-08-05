/**
 * This class represents various processes you might run on a computer 
 * @author Chris Burkhead
 *@version 0.1
 *Programming Project 2
 *Summer 2022
 */

public class Process implements Priority, Comparable<Process>{
	final private String ProcessID;
	private int priority;
	
	Process(){
		ProcessID="";
		priority=0;
	}//end empty constructor
	
/**
 * This is the preferred constructor for this class
 * @param ProcessID
 * @param priority 
 */
	Process(String ProcessID, int priority){
		this.ProcessID=ProcessID;
		this.priority=priority;
	}//end preferred constructor
	
/**
 * 
 * @returns the process 
 */
	public String getProcessID() {
		return ProcessID;
	}//end getProcessID
	
/**
 * @compares the priority level of the different processes and returns standard 0,1,-1 comparisons 
 */
	@Override
	public int compareTo(Process p1) {
		
		int compProcess = 0;
		
		if (this.priority==p1.priority)
			compProcess=0;
		if (this.priority>p1.priority)
			compProcess=1;
		if (this.priority<p1.priority)
			compProcess=-1;
		return compProcess;
	}//end compareTo
/**
 * @overrides the setPriority method established in the Priority interface
 */
	@Override
	public void setPriority(int priority) {
		this.priority=priority;
	}//end setPriority
/**
 * @overrides the getPriority method established in the Priority interface
 */
	@Override
	public int getPriority() {
		return priority;
	}//end getPriority
/**
 * @toString prints out the process and its priority
 */
	@Override
	public String toString() {
		return "Process [ProcessID=" + ProcessID + ", priority=" + priority + "]";
	}//end toString


}//end class

