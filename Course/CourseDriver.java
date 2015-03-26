
public class CourseDriver {

	public static void main(String[] args) {
		
		Course core = new Course ("Java");
		
		Address school = new Address("666 Wilshire Ave.",
			"Vilanov", "TX", 19082);
		
		Address home1 = new Address("11 AAA Street", "BBB City",
			"AB", 12345);
		
		Student joy = new Student("Joy", "Smith", home1,
			school, 80, 90, 85);
		
		Address home2 = new Address("22 CCC Street", "DDDD City",
			"CD", 67890);
		
		Student marsha = new Student("Marsha", "Jone", home2,
			school, 77, 99, 88);
		
		Address home3 = new Address("33 EEE Street", "FFF City",
			"EF", 13579);
		
		Student mike = new Student("Mikel", "Bevan", home3, school,
			86, 91, 63);
		
		Address home4 = new Address("44 GGG Street", "HHH City",
			"GH", 24680);
		
		Student ruby = new Student("Ruby", "Rock", home4, school,
			74, 85, 96);
		
		Address home5 = new Address("55 III Street", "JJJ Town",
			"IJ", 54321);
		
		Student tom = new Student("Tom", "Roy", home5, school,
			94, 75, 86);
	
	core.addStudent(joy);
	core.addStudent(marsha);
	core.addStudent(mike);
	core.addStudent(ruby);
	core.addStudent(tom);
	
	core.roll();
	
	System.out.println("The average of all students' test score averages: " + core.average());
	
	}

}
