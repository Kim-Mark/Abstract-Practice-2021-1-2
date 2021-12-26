
public class Rectangle2 extends Shape2{
	
	private double length;
	private double width;
	
	public Rectangle2(String Name, double Length, double Width) {
		this.name = Name;
		this.length = Length;
		this.width = Width;
	}
	
	//
		public double getLength() {
			return length;
		}
			
		public double getWidth() {
			return width;
		}
			
		//
		public double getArea() {
			return getLength() * getWidth();
		}
			
		//
		public double getPerimeter() {
			return getLength() * 2 + getWidth() * 2;
		}
}
