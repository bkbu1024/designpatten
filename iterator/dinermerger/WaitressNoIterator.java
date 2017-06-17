
import java.util.*;

public class WaitressNoIterator {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	public WaitressNoIterator(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {

			ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
			MenuItem[] lunchItems = dinerMenu.getMenuItems();

					System.out.println("USING FOR LOOPS");
					for (int i = 0; i < breakfastItems.size(); i++) {
						MenuItem menuItem = (MenuItem)breakfastItems.get(i);
						System.out.print(menuItem.getName());
						System.out.println("\t\t" + menuItem.getPrice());
						System.out.println("\t" + menuItem.getDescription());
					}

					for (int i = 0; i < lunchItems.length; i++) {
						MenuItem menuItem = lunchItems[i];
						System.out.print(menuItem.getName());
						System.out.println("\t\t" + menuItem.getPrice());
						System.out.println("\t" + menuItem.getDescription());
				}
		}
}