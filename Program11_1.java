
public class Program11_1 {

	public static void main(String[] args) {

		// Rectangle 
		Rectangle rec1;
		rec1 = new Rectangle("Mine", 5, 3);
		double area = rec1.getArea();
		double perimeter = rec1.getPerimeter();
		
		System.out.println("Name: " + rec1.getName());
		System.out.println("Length: " + rec1.getLength());
		System.out.println("Width: " + rec1.getWidth());
		System.out.println("Area: " + rec1.getArea());
		System.out.println("Perimeter: " + rec1.getPerimeter());
	}

}
