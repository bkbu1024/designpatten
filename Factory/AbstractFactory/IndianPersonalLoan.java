
public class IndianPersonalLoan implements PersonalLoan {

	private String desc = "Indian Personal Loan";

	public String getDesc() {

		return desc;
		}

	public int calcPersonalLoanEMI(){

		return 10000;
	}
}