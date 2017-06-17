
public class IndianLoanFactory implements LoanFactory{

	public CarLoan createCarLoan(){

			return new IndianCarLoan();
		}

	public PersonalLoan createPersonalLoan(){

				return new IndianPersonalLoan();
		}

	public HomeLoan createHomeLoan(){

				return new IndianHomeLoan();
		}
}