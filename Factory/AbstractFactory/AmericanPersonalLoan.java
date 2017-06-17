
public class AmericanPersonalLoan implements PersonalLoan {

	private String desc = "American Personal Loan";

	public String getDesc() {

		return desc;
		}

	public int calcPersonalLoanEMI(){

		return 10000;
	}
}