
public class Student {
	
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int score1, score2, score3;
	
public Student(){
	
	score1 = 0;
	score2 = 0;
	score3 = 0;
}

public Student(String first, String last, Address home, Address school, int test1, int test2, int test3){
	
	firstName = first;
	
	lastName = last;
	
	homeAddress = home;
	
	schoolAddress = school;
	
	score1 = test1;
	
	score2 = test2;
	
	score3 = test3;
		
}

public void setTestScore(int test, int score){
	
	if(test == 1)
		score1 = score;
	
	else if(test == 2)
		score2 = score;
	
	else if(test == 3)
		score3 = score;
	
	else{
		
		System.out.println("Wrong input: Test Number should be 1 or 2 or 3.");
		
		System.exit(0);
	}
	
}

public int getTestScore(int test){
	
	int score = -1;
	
	if(test == 1)
		score = score1;
	
	else if(test == 2)
		score = score2;
	
	else if(test == 3)
		score = score3;
	
	else{
		
		System.out.println("Wrong input: Test Number should be 1 or 2 or 3.");
		
		System.exit(0);
	}
	
	return score;
}

public double average(){
	
	double sum = score1 + score2 + score3;
	
	return sum/3;
	
}

public String toString(){
	
	String result;
	
	result = firstName + " " + lastName + " ";
	
	result += "Home Address: " + homeAddress + " ";
	
	result += "School Address: " + schoolAddress + " \n";
	
	result += "Three test scores: Test1: " + getTestScore(1)
	+ " Test2: " + getTestScore(2) + " Test3: " + 
	getTestScore(3) + " ";
	
	result += "The average of three test scores: " + average();
	
	return result;
	
}
	
}
