
public class IndianHomeLoan implements HomeLoan {

	private String desc = "Indian Home Loan";

	public String getDesc() {

		return desc;
		}

	public int calcHomeLoanEMI(){

		return 12000;
	}
}