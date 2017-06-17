public class Client {
    static public void main (String argv[]) {

		Shape r1, r2;
		Drawing dp;

		dp = new V1Drawing();
		r1 = new Rectangle(dp, 1, 1, 2, 2);

		dp = new V2Drawing();
		r2 = new Circle(dp, 2, 3, 3);

		r1.draw();
		r2.draw();
    }
 }