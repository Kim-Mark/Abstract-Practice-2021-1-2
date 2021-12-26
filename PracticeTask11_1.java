
public class PracticeTask11_1 {

	public static void main(String[] args) {
		
		// SalaryTaxPayer
		SalaryTaxPayer sp1 = new SalaryTaxPayer("Kim", 100, 30000000);
		System.out.println(sp1.toString());
		System.out.println(sp1.computeTax());
		
		//BusinessTaxPayer
		BuisnessTaxPayer bp1 = new BuisnessTaxPayer("Sun", 200, 120000000, 75000000);
		System.out.println(bp1.toString());
		System.out.println(bp1.computeTax());

	}

}
