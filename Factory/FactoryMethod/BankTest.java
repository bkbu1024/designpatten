public class BankTest {

  public static void main(String [] args){
  Bank bank = new AmericanBank();
  System.out.println("monthly charges = " + bank.calcMonthlyCharges("checkings"));
}
}