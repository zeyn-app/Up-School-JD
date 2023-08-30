package hardSkills_2023_03_21;

public class Triangle extends Shape{
	
	  private double firstEdge; 
	  private double secondEdge; 
	  private double thirdEdge;


	public Triangle() {
		super();
	}

	

	public Triangle(double firstEdge, double secondEdge, double thirdEdge) {
		super();
		this.firstEdge = firstEdge;
		this.secondEdge = secondEdge;
		this.thirdEdge = thirdEdge;
	}



	public double area() {
		double s = circumference()/2;
		return Math.sqrt((s*(s-firstEdge)*(s-secondEdge)*(s-thirdEdge))); 
	}

	public double circumference() {
		return firstEdge + secondEdge + thirdEdge;
	}

}
