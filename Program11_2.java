
public class Program11_2 {

	public static void main(String[] args) {
		// 
		Rectangle2 rec2;
		Circle c1;
		
		rec2 = new Rectangle2("Yours", 4, 8);
		double area = rec2.getArea();
		double perimeter = rec2.getPerimeter();
				
		System.out.println("Name: " + rec2.getName());
		System.out.println("Length: " + rec2.getLength());
		System.out.println("Width: " + rec2.getWidth());
		System.out.println("area: " + area);
		System.out.println("perimeter: " + perimeter);
		
		c1 = new Circle("That", 2.5);
		area = c1.getArea();
		perimeter = c1.getPerimeter();
		System.out.println("Name: " + c1.getName());
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("area: " + area);
		System.out.println("perimeter: " + perimeter);
		
		

	}

}
