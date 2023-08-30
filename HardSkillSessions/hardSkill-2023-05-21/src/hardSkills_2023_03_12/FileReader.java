package hardSkills_2023_03_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	public String[] readStudentListFromFile(String fileName) {
		String [] studentList = null;
		
		try {
			Scanner scanner =  new Scanner(new File(fileName));
			int numLines = 0;
			
			while(scanner.hasNextLine()) {
				scanner.nextLine();
				numLines++;
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return studentList;
	}

}
