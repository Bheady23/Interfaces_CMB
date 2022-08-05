/**
 * Class Interface Priority sets constants variables and two methods to be shared in the package
 * @author Chris Burkhead
 * @version 0.1
 * Programming Project 2
 * Summer 2022
 */
public interface Priority {

	final int MED_PRIORITY=5;
	
	final int MIN_PRIORITY=1;
	
	final int MAX_PRIORITY=10;
/**
 * 	
 * @param Setpriority method to be shared with classes Process and Task
 */
	public void setPriority(int priority);
/**
 * 
 * @return getPriority method to be shared with classes Process and Task
 */
	public int getPriority();
	
}//end interface

