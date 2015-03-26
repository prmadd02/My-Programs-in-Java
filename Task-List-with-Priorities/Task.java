
public class Task implements Priority {

	private String task;
	private int myPriority;
	
	public Task (String work){
		
		task = work;
		
	}
	
	public void setPriority (int priority){
		
		myPriority = priority;
		
	}
	
	public int getPriority(){
		
		return myPriority;
		
	}
	
	public String toString(){
		
		return ("Task: " + task + "\nPriority: " + myPriority + "\n");
		
	}
}
