public class Bank {

private Account acc;

public int calcMonthlyCharges(String accType) {

if ( accType.equals("savings"))
	acc = new SavingsAccount();
else if(accType.equals("checkings"))
	acc = new CheckingAccount();
else if(accType.equals("salary"))
	acc = new SalaryAccount();

int monthlyCharges = acc.calcMaintenanceCharges() + acc.calcSMSAlertCharges() + acc.calcATMCharges();
return monthlyCharges;
}
}