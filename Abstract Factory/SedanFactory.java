public class SedanFactory implements BodyPartFactory {

	public Door createDoor(){

		return new SedanDoor();
	}

	public Hood createHood(){

			return new SedanHood();
	}
}