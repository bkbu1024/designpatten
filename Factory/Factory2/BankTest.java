public class BankTest {

  public static void main(String [] args){
  Bank bank = new Bank();
  System.out.println("monthly charges = " + bank.calcMonthlyCharges("checking"));
}
}