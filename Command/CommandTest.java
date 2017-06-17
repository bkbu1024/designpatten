public class CommandTest {

	public static void main (String [] args) throws InterruptedException {

		Printer printer = new Printer();

		printer.registerJob(new PrintJob());

		Thread.sleep(5);

		printer.printJobs();
	}
}