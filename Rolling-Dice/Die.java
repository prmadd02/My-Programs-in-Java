
public class Die {
	
	private final int MAX = 6;
	
	private int faceValue;
	
	public Die(){
		faceValue = 1;
	}

	public int roll(){
		faceValue = (int)(Math.random() * MAX) + 1;
		
		return faceValue;
	}
	
	public void setFaceValue(int Value){
		
		if (value >= 1 && value <= 6)
		faceValue = Value;
	}
	
	public int getFaceValue(){
		return faceValue;
	}
	
	public String toString(){
		String result = Integer.toString(faceValue);
		
		return result;
	}
}
