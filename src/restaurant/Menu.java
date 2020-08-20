package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public String lastUpdated;

    private ArrayList<MenuItem> menu = new ArrayList<>();

    public Menu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    private void menuUpdated() {
        // gets current date from java.util.date
        Date currentTime = new Date();
        // calls setLastUpdated() with current date as argument
        setLastUpdated(currentTime.toString());
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    private void setLastUpdated(String aLastUpdated) {
        lastUpdated = aLastUpdated;
    }

    private void addMenuItem(MenuItem item) {
        menu.add(item);
        menuUpdated();
    }

    private void removeMenuitem(MenuItem item) {
        menu.remove(item);
        menuUpdated();
    }
}
