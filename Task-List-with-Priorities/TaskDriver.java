
public class TaskDriver {

	public static void main(String[] args) {
		Task t1 = new Task("Study");
		Task t2 = new Task("Playing");
		
		t1.setPriority(1);
		t2.setPriority(2);
		
		System.out.println(t1);
		System.out.println(t2);
	}

}
