public class AccountFactory {

public static Account createAccount(String accType){

Account acc=null;

if ( accType.equals("savings"))
	acc = new SavingsAccount();
else if(accType.equals("checking"))
	acc = new CheckingAccount();
else if(accType.equals("salary"))
	acc = new SalaryAccount();

	return acc;
}
}