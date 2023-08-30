package hardSkills_2023_03_25;

public class Book {
	private String author;
	private String name;
	private int pageNumber;
	private BookTypes type;
	
	public Book() {
		super();
	}

	public Book(String author, String name, int pageNumber, BookTypes type) {
		this.author = author;
		this.name = name;
		this.pageNumber = pageNumber;
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public void printInfo() {
		
		System.out.println("\n**********************");
		
		System.out.println("Kitap Adı: " + name + "\nYazar: " + author + "\nSayfa Sayısı: " + pageNumber + "\nType: " + type);
	}
}
