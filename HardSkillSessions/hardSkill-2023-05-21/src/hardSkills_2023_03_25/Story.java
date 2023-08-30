package hardSkills_2023_03_25;

public class Story extends Book{
	
	public Story() {
		super();
	}
	

	public Story(String author, String name, int pageNumber) {
		super(author, name, pageNumber, BookTypes.STORY);
	}
	
	
	/*public void printInfo() {
		super.printInfo();
		System.out.println("Tür: " + type);
		
	}*/
	
}
