package restaurant;

public class Restaurant {

    public static void main(String[] args) {

        Menu dinnerMenu = new Menu("Dinner Menu");

        dinnerMenu.addMenuItem("Pizza", 9.99, "Pepperoni and Sausage Pizza", "Entree");
        dinnerMenu.addMenuItem("Tomato Bisque", 5.99, "Best Damn Tomato Bisque", "Soup");
        dinnerMenu.addMenuItem("Dinner Salad", 13.99, "Spinach with Chicken", "Salad");

        System.out.println("\n PRINT MENU \n");

        dinnerMenu.printMenu();

        System.out.println("\n PRINT SINGLE MENU ITEM \n");

        dinnerMenu.printMenuItemByIndex(dinnerMenu.findMenuItemIndex("Tomato Bisque", 5.99, "Soup"));

        dinnerMenu.removeMenuItemByIndex(dinnerMenu.findMenuItemIndex("Tomato Bisque", 5.99, "Soup"));
    }

}
