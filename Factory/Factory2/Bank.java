public class Bank {

private Account acc;

public int calcMonthlyCharges(String accType) {

acc = AccountFactory.createAccount(accType);

int monthlyCharges = acc.calcMaintenanceCharges() + acc.calcSMSAlertCharges() + acc.calcATMCharges();
return monthlyCharges;
}
}