package restaurant;

public class Restaurant {

    public static void main(String[] args) {

        Menu dinnerMenu = new Menu("Dinner Menu");

        dinnerMenu.addMenuItem("Pizza", 9.99, "Pepperoni and Sausage Pizza", "Entree");
        dinnerMenu.addMenuItem("Tomato Bisque", 5.99, "Best Damn Tomato Bisque", "Soup");
        dinnerMenu.addMenuItem("Dinner Salad", 13.99, "Spinach with Chicken", "Salad");

        dinnerMenu.printMenu();


    }

}
