public class IndianBank extends Bank{


Account createAccount(String accType) {

Account acc=null;

if ( accType.equals("savings"))
	acc = new IndianSavingsAccount();
else if(accType.equals("checking"))
	acc = new IndianCheckingAccount();
else if(accType.equals("salary"))
	acc = new IndianSalaryAccount();

	return acc;
	}
}