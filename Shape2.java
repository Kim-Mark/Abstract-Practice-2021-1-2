
public abstract class Shape2 {


	public String name;
	

	private static int numShape = 0;
	

	public Shape2() {
		numShape++;
	}
	

	public static int getNumber() {
		return numShape;
	}
	

	public String getName() {
		return name;
	}
	

	public abstract double getArea();
	public abstract double getPerimeter();
	
}
