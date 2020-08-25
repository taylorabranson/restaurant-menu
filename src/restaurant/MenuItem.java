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

    public boolean isNew() {
        // checks dateAdded against current date
        // returns true if added < 1 month ago
        // else return false
        currentTime = new Date();
        double millisecondsInOneMonth = 2629746000.0;
        if (getCurrentTime().getTime() - millisecondsInOneMonth >= getDateAdded().getTime()) {
            return true;
        } else {
            return false;
        }
    }

    private Date getCurrentTime() {
       return currentTime;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public Date getDateAdded() {
        return this.dateAdded;
    }

    public void setDateAdded(Date aDateAdded) {
        this.dateAdded = aDateAdded;
    }

    public String getDateAddedString() {
       return this.dateAdded.toString();
    }
}
