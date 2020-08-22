package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private String lastUpdated;

    private ArrayList<MenuItem> menu;

    private Menu(ArrayList<MenuItem> menu) {
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

    public void addMenuItem(MenuItem item) {
        menu.add(item);
        menuUpdated();
    }

    public void removeMenuItem(MenuItem item) {
        menu.remove(item);
        menuUpdated();
    }
}
