
public class PowerWindows extends ExtraFittings{

	String desc = "Power Windows ";
	private Car car;

	public PowerWindows(Car c) {

		car = c;
	}

	public int cost(){

		System.out.println(desc);
		return 18000 + car.cost();
	}
}