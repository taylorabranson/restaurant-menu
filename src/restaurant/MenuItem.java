package restaurant;

import java.util.Date;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;
    private Date currentTime;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.currentTime = new Date ();
        this.dateAdded = this.currentTime;
    }

    // getters/setters

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public Date getDateAdded() {
        return this.dateAdded;
    }

    private Date getCurrentTime() {
       return currentTime;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setDateAdded(Date aDateAdded) {
        this.dateAdded = aDateAdded;
    }

    // other methods

    public void printMenuItem() {
        System.out.println(getName());
        if (isNew()) {
            System.out.println("New Item!");
        }
        System.out.println("$" + getPrice());
        System.out.println(getDescription());
        System.out.println(getCategory());
    }

    public boolean isNew() {
        // returns true if added < 1 month ago
        currentTime = new Date();
        double millisecondsInOneMonth = 2629746000.0;
        if (getCurrentTime().getTime() - millisecondsInOneMonth >= getDateAdded().getTime()) {
            return true;
        } else {
            return false;
        }
    }

    public String dateAddedString() {
        return this.dateAdded.toString();
    }
}
