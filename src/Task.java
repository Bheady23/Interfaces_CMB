/**
 * This class represents various Tasks you might complete at home 
 * @author Chris Burkhead
 *@version 0.1
 *Programming Project 2
 *Summer 2022
 */
public class Task implements Priority, Comparable<Task>{
	
	enum Status {NOT_STARTED, IN_PROCESS, COMPLETE}
	private final String name;
	private int priority;
	private Task.Status status;
	
	
/**
 * @empty argument constructor	
 */
	public Task() {
		name="";
		priority=0;
	}//end constructor
/**
 * 
 * @param name
 * @param priority
 * @param status 
 */
	public Task(String name, int priority, Status status) {
		this.name=name;
		this.priority=priority;
		this.status=status;
	}//end preferred constructor
/**
 * 
 * @return getStatus
 */
	public Status getStatus() {
		return status;
	}//end getStatus
/**
 * 
 * @param setStatus
 */
	public void setStatus(Status status) {
		this.status = status;
	}//end setStatus
/**
 * 
 * @return getName
 */
	public String getName() {
		return name;
	}//end getName
/**
 * @overrides compareTo method and uses if statements to compare different priority levels of Task 
 *  using stand 0,1,-1 comparisons 
 */
	@Override
	public int compareTo(Task task2){
		int comparison=0;
		
		if (this.priority==task2.priority)
			comparison=0;
		if (this.priority>task2.priority)
			comparison=1;
		if (this.priority<task2.priority)
			comparison=-1;
			
		return comparison;
	}//end compareTo
/**
 * @overrides setPriority establish in Priority interface
 */
	@Override
	public void setPriority(int priority) {
		this.priority=priority;
	}//end SetPriority
/**
 * @overrides getPriority establish in Priority interface
 */
	@Override
	public int getPriority() {
		
		return priority;
	}//end getPriority
/**
 * @overrides toString printing the Task, it's priority level and current status of completion
 */
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", status=" + status + "]";
	}//end getPriority
	
}//end class

