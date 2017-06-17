public abstract class Bank {

private Account acc;

LoanFactory loanFactory;

	public int calcMonthlyCharges(String accType) {

acc = createAccount(accType);
System.out.println("\n" + "monthly charges for: " + acc.getDesc());

int monthlyCharges = acc.calcMaintenanceCharges() + acc.calcSMSAlertCharges() + acc.calcATMCharges();
return monthlyCharges;
}

abstract  Account createAccount(String accType);

	public int calcMonthlyEMIs() {

		HomeLoan hl = loanFactory.createHomeLoan();
		System.out.println("loan: " + hl.getDesc());
		CarLoan cl = loanFactory.createCarLoan();
		System.out.println("loan: " + cl.getDesc());
		PersonalLoan pl = loanFactory.createPersonalLoan();
		System.out.println("loan: " + pl.getDesc());

		return hl.calcHomeLoanEMI() + cl.calcCarLoanEMI() + pl.calcPersonalLoanEMI();

	}

}