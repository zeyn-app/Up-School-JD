package hardSkills_2023_03_25;

public class Novel extends Book{
	
	public Novel() {
		super();
	}
	

	public Novel(String author, String name, int pageNumber) {
		super(author, name, pageNumber, BookTypes.NOVEL);
	}
	
	
	/*public void printInfo() {
		//System.out.println("\n**********************");
		//printInfo();
		super.printInfo();
		System.out.println("Tür: " + BookTypes.NOVEL);
		
	}*/
	
	
}
