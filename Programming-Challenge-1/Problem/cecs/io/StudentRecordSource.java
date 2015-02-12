package cecs.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



// since our StudentRecord class is in the "cecs" package, we need an import statement to include it;
// alternatively, we could issue "import cecs.*" to include all items (i.e. both classes and packages under "cecs")
import cecs.StudentRecord; 	

public class StudentRecordSource {

	private File file;
	private int numberOfRecords = -1;
	private StudentRecord[] studentRecords;
	
	/**
	 * Initializes the data source for reading; if the location is invalid, then an exception is thrown
	 * 
	 * @param String location the location of the data source in the filesystem
	 */
	public StudentRecordSource(String location) {
		
		file = new File(location);
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	/**
	 * Retrieves the number of records in the data source
	 * 
	 * @return int
	 */
	public int getNumberOfRecords() {
		
		if(numberOfRecords > -1)
			return numberOfRecords;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			numberOfRecords = 0;
			
			while(br.ready()) {
				br.readLine();
				numberOfRecords++;
			}
			
		} catch(FileNotFoundException e) {
		
		} catch (IOException e) {

		}
		
		return numberOfRecords;
	}
	
	/**
	 * Retrieves a batch of n records, where n is the total number of results in the batch
	 * 
	 * 
	 * @param offset the index from which to begin the batch retrieval from the data source
	 * @param number the total number of records in the batch
	 * @return StudentRecord[] an array of StudentRecord
	 */
	public StudentRecord[] getRecords(int offset, int number) {
		
		if(studentRecords == null || !(studentRecords.length > 0))
			setRecords();
		
		if(offset > studentRecords.length || number > studentRecords.length
				|| number <= 0)
			return null;
		
		StudentRecord[] temp = new StudentRecord[number];
		
		for(int i = 0; i < number; i++) {
			temp[i] = studentRecords[offset+i];
		}
		return temp;
	}
	
	/**
	 * Reads the records into memory
	 * 
	 */
	private void setRecords() {
		
		studentRecords = new StudentRecord[getNumberOfRecords()];
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			int i = 0;
			while(br.ready()) {
				String[] elements = br.readLine().split(",");
				StudentRecord sr = new StudentRecord(elements[1]);
				studentRecords[i++] = sr;
			}
			
		} catch(FileNotFoundException e) {
		
		} catch (IOException e) {

		}
	}

}
