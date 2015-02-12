package cecs.example;

import cecs.StudentRecord;
import cecs.io.StudentRecordSource;

public class StudentRecordClient {

	public static void main(String[] args) {
		
		StudentRecordSource rs = new StudentRecordSource("students.txt");
		
		// initialized veriables
		int batchSize = 10;
		int numRecords = rs.getNumberOfRecords();
		
		// created a true/false ? operator to cover the possibly that not all names would end up in batches
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
