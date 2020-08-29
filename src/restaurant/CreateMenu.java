package restaurant;

public class CreateMenu {

    public static void main(String[] args) {

        Menu dinnerMenu = new Menu("Dinner Menu");

        dinnerMenu.addMenuItem("Pizza", 9.99, "Pepperoni and Sausage Pizza", "Entree");
        dinnerMenu.addMenuItem("Tomato Bisque", 5.99, "Best Damn Tomato Bisque", "Side");

        dinnerMenu.printMenu();

        dinnerMenu.addMenuItemFromUserInput();

        dinnerMenu.printMenu();
    }
}
