public class V2Drawing extends Drawing {
    public void drawLine (double x1,double y1,double x2,double y2) {
        // arguments are different in DP2
        // and must be rearranged
        DP2.drawLine(x1,x2,y1,y2);
    }
    public void drawCircle (double x, double y,double r) {
        DP2.drawCircle(x,y,r);
    }
}