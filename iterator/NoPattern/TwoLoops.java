
for (int i = 0; i < breakfastItems.size(); i++) {

	MenuItem menuItem = (MenuItem )breadfastItems.get(i);

	System.out.println(menuItem.getName() + " ");
	System.out.println(menuItem.getPrice() + " ");
	System.out.println(menuItem.getDescription() + " ");
}

for (int i = 0; i < luchItems.length; i++) {

	MenuItem menuItem = lunchItem[i];

	System.out.println(menuItem.getName() + " ");
	System.out.println(menuItem.getPrice() + " ");
	System.out.println(menuItem.getDescription() + " ");
}