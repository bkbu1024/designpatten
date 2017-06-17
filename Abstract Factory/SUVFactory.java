public class SUVFactory implements BodyPartFactory {

	public Door createDoor(){

		return new SUVDoor();
	}

	public Hood createHood(){

			return new SUVHood();
	}
}