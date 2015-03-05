
public class TestDieClass {

	public static void main(String[] args) {
		
		Die die=new Die();
		
		die.setFaceValue(4);
		System.out.println("Input value: " + 4);
		System.out.println("Result value: " + die.getFaceValue());
		
		die.setFaceValue(12);
		System.out.println("Input value: " + 12);
		System.out.println("Result value: " + die.getFaceValue());
		
	}

}
