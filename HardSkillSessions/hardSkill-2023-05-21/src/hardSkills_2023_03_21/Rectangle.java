package hardSkills_2023_03_21;

public class Rectangle extends Shape {

	private double shortEdge;
	private double longEdge;

	public Rectangle() {
		super();
	}

	public double area() {
		return shortEdge * longEdge;
	}

	public double circumference() {
		return 2 * (shortEdge + longEdge);
	}

}
