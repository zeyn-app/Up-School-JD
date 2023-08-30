package hardSkills_2023_03_21;

public class Circle extends Shape{
	
	private final double PI = 3.14;
	private double radius;
	
	public Circle(){
		super();
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return PI*radius*radius;
	}
	
	public double circumference() {
		return 2*PI*radius;
	}

}
