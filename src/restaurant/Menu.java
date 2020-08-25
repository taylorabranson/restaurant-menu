package restaurant;

import java.util.ArrayList;
import java.util.Date;

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

    private void menuUpdated() {
        // gets current date from java.util.date
        Date currentTime = new Date();
        setLastUpdated(currentTime);
    }

    public String getMenuName() {
        return this.menuName;
    }

    public void setMenuName(String aMenuName) {
        this.menuName = aMenuName;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    private void setLastUpdated(Date aLastUpdated) {
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
        System.out.println("Last Updated: " + getLastUpdated().toString());
        for (MenuItem item : this.menu) {
            System.out.println("\n*******\n");
            item.printMenuItem();
        };
    }
}
