package restaurant;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private int dateAdded;

    public MenuItem(double price, String description, String category, int dateAdded) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public boolean isNew() {
        // checks dateAdded against current date
        // returns true if added < 1 month ago
        // else return false
        return true;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public int getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(int aDateAdded) {
        dateAdded = aDateAdded;
    }
}
