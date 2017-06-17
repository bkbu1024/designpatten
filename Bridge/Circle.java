public class Circle extends Shape {
    private double _x,_y,_r;
    public Circle (Drawing dp,double x,double y,double r) {
        super(dp);
        x= x;_y= y;_r= r;
    }
    public void draw() {
        myDrawing.drawCircle(_x,_y,_r);
    }
}