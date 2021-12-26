
public class SalaryTaxPayer extends TaxPayer{

	private int salary;
	
	public SalaryTaxPayer(String name, int num, int salary) {
		super(name, num);
		this.salary = salary;
	}
	
	// setter
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// getter
	public int getSalary() {
		return salary;
	}
	
	//
	public String toString() {
		return "Name:" + getName() + ", Number:" + getNum() + "Pay:" + getSalary();
	}
	
	//
	public double computeTax() {
		double tax;
		if(getSalary() <= 20000000) {
			tax = getSalary() * 0.05;
		}
		else if(getSalary() >= 20000000 && getSalary() <= 40000000) {
			tax = getSalary() * 0.1;
		}
		else if(getSalary() >= 40000000 && getSalary() <= 60000000) {
			tax = getSalary() * 0.15;
		}
		else if(getSalary() >= 60000000 && getSalary() <= 80000000) {
			tax = getSalary() * 0.2;
		}
		else {
			tax = getSalary() * 0.3;
		}
		return tax;
	}

	
}
