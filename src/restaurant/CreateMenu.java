package restaurant;

public class CreateMenu {

    public static void main(String[] args) {

        MenuItem pizza = new MenuItem("Cheese Pizza", 9.99, "Pepperoni and Sausage Pizza", "Entree");
        MenuItem soup = new MenuItem("Tomato Bisque", 5.99, "Best Damn Tomato Bisque", "Side");


        Menu dinnerMenu = new Menu("Dinner Menu");
        dinnerMenu.addMenuItem(pizza);
        dinnerMenu.addMenuItem(soup);

        dinnerMenu.printMenu();
        dinnerMenu.printMenu();

    }
}
