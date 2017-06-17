public abstract class Bank {

private Account acc;

public int calcMonthlyCharges(String accType) {

acc = createAccount(accType);
System.out.println("\n" + "monthly charges for: " + acc.getDesc());

int monthlyCharges = acc.calcMaintenanceCharges() + acc.calcSMSAlertCharges() + acc.calcATMCharges();
return monthlyCharges;
}

abstract  Account createAccount(String accType);

}