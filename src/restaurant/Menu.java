package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private String menuName;
    private String lastUpdated;
    private ArrayList<MenuItem> menu;

    public Menu(String menuName, ArrayList<MenuItem> menu) {
        this.menuName = menuName;
        this.menu = menu;
        menuUpdated();
    }

    public Menu(String menuName) {
        this(menuName, new ArrayList<>());
    }

    private void menuUpdated() {
        // gets current date from java.util.date
        Date currentTime = new Date();
        // calls setLastUpdated() with current date as argument
        setLastUpdated(currentTime.toString());
    }

    public String getMenuName() {
        return this.menuName;
    }

    public void setMenuName(String aMenuName) {
        this.menuName = aMenuName;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    private void setLastUpdated(String aLastUpdated) {
        this.lastUpdated = aLastUpdated;
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
        menuUpdated();
    }

    public void removeMenuItem(MenuItem item) {
        menu.remove(item);
        menuUpdated();
    }

    public void printMenu() {
        System.out.println(getMenuName());
        System.out.println("Last Updated: " + getLastUpdated());
        for (MenuItem item : this.menu) {
            System.out.println("\n*******\n");
            System.out.println(item.getName());
            if (item.isNew()) {
                System.out.println("New Item!");
            }
            System.out.println("$" + item.getPrice());
            System.out.println(item.getDescription());
            System.out.println(item.getCategory());
            System.out.println("Added on: " + item.getDateAddedString());
        };
    }
}
