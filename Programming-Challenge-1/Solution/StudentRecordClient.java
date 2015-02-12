package cecs.example;

// We need to include our resources from the 'cecs' and 'cecs.io' packages; alternatively, we could include use the
//	cecs.* notation, which would include all the classes in the cecs package and in subpackages.

import cecs.StudentRecord;
import cecs.io.StudentRecordSource;

public class StudentRecordClient {

	public static void main(String[] args) {
		
		StudentRecordSource rs = new StudentRecordSource("students.txt");
		
		// Example using the StudentRecordSource API; this will print the StudentRecords
		//	(from the beginning of the resultset to the 25th entry) to the terminal
		/*int i = 1;
		for(StudentRecord sr : rs.getRecords(0,25))
		{
			if(sr != null) {
				System.out.println(i + " " + sr.getName());
				System.out.println("-----------");
				i++;
			}
		}*/
		
		
		// Using the StudentRecordSource API (i.e. the methods
		//	getNumberOfRecords() and getRecords(int, int))  I want you to
		//	iterate over the entire record set, displaying 10 records at a time.
		//  Note you may also parameterize this constant.
		//  
		//	As a user of the StudentRecordSource API, assume that you have no 
		// 	knowledge of the implementation details or the sample data.
		//
		//
		// This task is a common in real-world settings, whether iterating a record
		//  set from a database, or paginating a list of articles; you'll need
		//  to do perform this task.
	
		int batchSize = 10;
		int numRecords = rs.getNumberOfRecords();
		int numBatches = (numRecords % batchSize) > 0 ? (numRecords/batchSize) + 1 : (numRecords/batchSize);
		
		int i = 0;
		
		while(i < numBatches) {
			
			int limit = batchSize;
			
			if((i * batchSize + limit) > numRecords)
				limit = batchSize - ((i * batchSize + limit) - numRecords);
			
			for(StudentRecord sr : rs.getRecords(i * batchSize, limit)) {
				System.out.println(sr.getName());
			}

			i++;
		}		
		
	}

	
}
