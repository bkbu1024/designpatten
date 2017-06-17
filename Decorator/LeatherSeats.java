
public class LeatherSeats extends ExtraFittings{

	String desc = "Leather Seats ";
	private Car car;

	public LeatherSeats(Car c) {

		car = c;
	}

	public int cost(){

		System.out.println(desc);
		return 25000 + car.cost();
	}
}