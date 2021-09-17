package Restaurant;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Date itemUpdated;
    //private Boolean newItem;


    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", itemUpdated=" + itemUpdated +
                '}';
    }

    public MenuItem(String name,
                    Double price,
                    String description,
                    String category,
                    Date itemUpdated,
                    Boolean newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.itemUpdated = new Date();
        //this.newItem = true;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        this.itemUpdated = new Date();
    }


    public Double getPrice() {

        return this.price;
    }

    public void setPrice(Double price) {

        this.price = price;
        this.itemUpdated = new Date();
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
        this.itemUpdated = new Date();
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
        this.itemUpdated = new Date();
    }



    public Date getItemUpdated() {
        return itemUpdated;
    }


    public Boolean isNew() {
        Date today = new Date();

        long diffInMillies = Math.abs(today.getTime() + this.getItemUpdated().getTime());
        long diffDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return diffDays < 28;
    }
}