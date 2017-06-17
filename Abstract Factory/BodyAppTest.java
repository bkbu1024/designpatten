public class BodyAppTest{

	public static void main(String[] args){

		BodyPartFactory bpf = new SedanFactory();

		bpf.createDoor().cut();
		bpf.createHood().cut();
	}
}