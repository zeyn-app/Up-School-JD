package hardSkills_2023_03_25;

public class History extends Book{

private String type;
	
	public History() {
		super();
	}
	

	public History(String author, String name, int pageNumber) {
		super(author, name, pageNumber, BookTypes.HISTORY);
		this.type = type;
	}
	
	
	public void printInfo() {
		
		super.printInfo();
		System.out.println("Tür: " + type);
		
	}
}
