
public class BuisnessTaxPayer extends TaxPayer{

	private int sales; 
	private int expenses; 
	 
	public BuisnessTaxPayer(String name, int num, int sales, int expenses) {
		super(name, num);
		this.sales = sales;
		this.expenses = expenses;
	}
	
	// setter
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	
	// getter
	public int getSales() {
		return sales;
	}
	
	public int getExpenses() {
		return expenses;
	}
	
	// 
	public String toString() {
		return "이름:" + getName() + ", 번호:" + getNum() + "총매출액:" + getSales() + "총비용:" + getExpenses();
	}
	
	// 
	public double computeTax() {
		double tax;
		if(getSales() - getExpenses() <= 0) {
			tax = 0;
		}
		else if(getSales() - getExpenses() > 0 && getSales() - getExpenses() <= 40000000) {
			tax = (getSales() - getExpenses()) * 0.1;
		}
		else {
			tax = (getSales() - getExpenses()) * 0.2;
		}
		return tax;
	}
}
