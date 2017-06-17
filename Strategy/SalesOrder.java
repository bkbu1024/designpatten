public class SalesOrder {
    public void process (CalcTax taxToUse) {
        long itemNumber= 0;
        double price= 0;
        
        double tax = taxToUse.taxAmount(itemNumber,price);
    }
}