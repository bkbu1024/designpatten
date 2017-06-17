
public class AmericanLoanFactory implements LoanFactory{

	public CarLoan createCarLoan(){

			return new AmericanCarLoan();
		}

	public PersonalLoan createPersonalLoan(){

				return new AmericanPersonalLoan();
		}

	public HomeLoan createHomeLoan(){

				return new AmericanHomeLoan();
		}
}