public class AmericanBank extends Bank{

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