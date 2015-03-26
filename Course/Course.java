
public class Course {
	
	private String course;
	
	private int students;
	
	private Student student1, student2, student3, student4, student5;
	
	public Course(String courseName){
		
		course = courseName;
		students = 0;
	}
	
	public void addStudent(Student stdnt){
		
		switch(students){
			
		case 0:
			student1 = stdnt;
			break;
			
		case 1:
			student2 = stdnt;
			break;
		
		case 2:
			student3 = stdnt;
			break;
		
		case 3:
			student4 = stdnt;
			break;
		
		case 4:
			student5 = stdnt;
			break;
		
		default:
			System.out.println("Should maintain five students.");
		
		}
		
		students++;
		
	}
	
	public double average(){
		
		return(student1.average() + student2.average() + student3.average()
			+ student4.average() + student5.average())/5;
		
	}
	
	public void roll(){
		
		String result = "";
		
		result += "Course name: " + course + " \n";
		
		result += "The details of the students under this course: \n\n";
		
		result += "Student1 details: \n";
		
		result += student1 + " \n\n";
		
		result += "Student2 details: \n";
		
		result += student2 + " \n\n";
		
		result += "Student3 details: \n";
		
		result += student3 + " \n\n";
		
		result += "Student4 details: \n";
		
		result += student4 + " \n\n";
		
		result += "Student5 details: \n";
		
		result += student5 + " \n\n";
		
		System.out.println(result);
		
	}
}
