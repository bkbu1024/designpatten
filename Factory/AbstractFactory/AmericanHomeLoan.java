
public class AmericanHomeLoan implements HomeLoan {

	private String desc = "American Home Loan";

	public String getDesc() {

		return desc;
		}

	public int calcHomeLoanEMI(){

		return 1500;
	}
}