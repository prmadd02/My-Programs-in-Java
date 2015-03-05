public class RollingDice2 {

	public static void main(String[] args) {
		
		PairOfDice pod = new PairOfDice();
		
		System.out.println("Default die one is " + pod.die1 + ".");
		System.out.println("Default die two is " + pod.die2 + "."); 
		System.out.println("Their sum is " + pod.sumOfTwoDiceValues() + ".");
		System.out.println();
		
		pod.rollTwoDice();
		
		System.out.println("Random die one is " + pod.die1 + ".");
		System.out.println("Random die two is " + pod.die2 + ".");
		System.out.println("Their sum is " + pod.sumOfTwoDiceValues() + ".");
		System.out.println();
		
		pod.setDie1Value(5);
		pod.setDie2Value(4);
			
		System.out.println("Manual die one is " + pod.die1 + ".");
		System.out.println("Manual die two is " + pod.die2 + ".");
		System.out.println("Their sum is " + pod.sumOfTwoDiceValues() + ".");
		System.out.println();
	}

}
