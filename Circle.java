
public class Circle extends Shape2{
	
	// 
	private double radius;
	
	// 
	public Circle(String Name, double Radius) {
		this.name = Name;
		this.radius = Radius;
	}
	
	// 
	public double getRadius() {
		return radius;
	}
	
	// 
	public double getArea() {
		return getRadius() * getRadius() * 3.14;
	}
	
	// 
	public double getPerimeter() {
		return getRadius() * 2 * 3.14;
	}
	
	

}
