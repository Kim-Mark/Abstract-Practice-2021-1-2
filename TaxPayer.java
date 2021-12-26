
public abstract class TaxPayer {
	
	protected String name;
	protected int num;

	public TaxPayer(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return num;
	}
	
	public String toString() {
		return "Name: " + getName() + ", Number: " + getNum();
	}

}
