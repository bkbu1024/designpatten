public class Test {

    public static void main(String argv[]) {

        CalcTax myTax;
        myTax= new USTax();
        SalesOrder mySO= new SalesOrder();
        mySO.process(myTax);
    }
}