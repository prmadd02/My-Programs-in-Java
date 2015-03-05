
public class PairOfDice {
	
	Die die1;
	Die die2;
	
	public PairOfDice(){
		die1 = new Die();
		die2 = new Die();
	}

	public void setDie1Value(int value1){
		die1.setFaceValue(value1);
	}
	
	public int getDie1Value(){
		return die1.getFaceValue();
	}
	
	public void setDie2Value(int value2){
		die2.setFaceValue(value2);
	}
	
	public int getDie2Value(){
		return die2.getFaceValue();
	}
	
	public void rollTwoDice(){
		die1.roll();
		die2.roll();
	}

	public int sumOfTwoDiceValues(){
		return getDie1Value() + getDie2Value();
	}

		
}
