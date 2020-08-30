package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    private String menuName;
    private Date lastUpdated;
    private ArrayList<MenuItem> menu;

    public Menu(String menuName, ArrayList<MenuItem> menu) {
        this.menuName = menuName;
        this.menu = menu;
        this.lastUpdated = new Date();
    }

    public Menu(String menuName) {
        this(menuName, new ArrayList<>());
    }

    // getters/setters

    public String getMenuName() {
        return this.menuName;
    }

    public void setMenuName(String aMenuName) {
        this.menuName = aMenuName;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(Date aLastUpdated) {
        this.lastUpdated = aLastUpdated;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    // add/remove MenuItem from menu
    public void addMenuItem(String name, double price, String description, String category) {
        int menuLength = menu.size();
        MenuItem item = new MenuItem(name, price, description, category);
        menu.add(item);
        if (menuLength < menu.size()) {
            menuUpdated();
        }
    }

    public void addMenuItemFromUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of item: ");
        String name = input.nextLine();
        System.out.println("Enter price: ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Enter description: ");
        String description = input.nextLine();
        System.out.println("Enter category: ");
        String category = input.nextLine();
        input.close();
        this.addMenuItem(name, price, description, category);
    }

    public void removeMenuItem(String name, String category) {
        int index = findMenuItemIndex(name, category);
        menu.remove(index);
        menuUpdated();
    }

    // other methods

    private void menuUpdated() {
        // gets current date from java.util.date
        Date currentTime = new Date();
        setLastUpdated(currentTime);
    }

    public void printMenu() {
        System.out.println(getMenuName());
        System.out.println("Menu Last Updated: \n" + getLastUpdated().toString());
        for (MenuItem item : this.menu) {
            System.out.println("\n*******\n");
            item.printMenuItem();
        }
        ;
    }

    public void printMenuItem(String name, String category) {
        int index = findMenuItemIndex(name, category);
        menu.get(index).printMenuItem();
    }

    public int findMenuItemIndex(String name, String category) {
        MenuItem item;
        for (int i = 0; i < menu.size(); i++) {
            item = menu.get(i);
            if (item.getName() == name && item.getCategory() == category) {
                return i;
            }
        }
        return -1;
    }
}
