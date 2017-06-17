
public class DecoratorTest{

	public static void main(String [] args) {

		Car c = new PowerWindows( new AlloyWheels( new VXCar() ));

		System.out.println("Cost = " + c.cost());
	}
}