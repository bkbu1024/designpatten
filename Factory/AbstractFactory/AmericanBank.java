public class AmericanBank extends Bank{

public AmericanBank(){

	loanFactory = new AmericanLoanFactory();
}

Account createAccount(String accType) {

Account acc = null;

if ( accType.equals("savings"))
	acc = new AmericanSavingsAccount();
else if(accType.equals("checkings"))
	acc = new AmericanCheckingAccount();
else if(accType.equals("salary"))
	acc = new AmericanSalaryAccount();

	return acc;
	}
}