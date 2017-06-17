
public class AlloyWheels extends ExtraFittings{

	String desc = "Alloy Wheels";
	private Car car;

	public AlloyWheels(Car c) {

		car = c;
	}

	public int cost(){

		System.out.println(desc);
		return 40000 + car.cost();
	}
}