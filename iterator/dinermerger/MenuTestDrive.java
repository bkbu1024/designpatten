
import java.util.*;

public class MenuTestDrive {
	public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		//WaitressNoIterator waitress = new WaitressNoIterator(pancakeHouseMenu, dinerMenu);

		// With iterators
		waitress.printMenu();

	}
}
