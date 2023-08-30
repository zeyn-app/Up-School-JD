package hardSkills_2023_03_12;

import java.util.Random;

public class ChooseRandomTrainee {

	public static void main(String[] args) {
		
		FileReader fileReader = new FileReader();
		
		if(args.length != 1) {
			System.out.println("Lütfen bir tam saı giriniz");
			return;
		}
		
		int numStudents = Integer.parseInt(args[0]);
		
		String [] studentList = null; 
		
		
		
		//studentList = fileReader.

	}
	
	public static void getRandomUser() {
		Random random = new Random();
		
		int user = random.nextInt();
		
		//return users[user];
	}

}
