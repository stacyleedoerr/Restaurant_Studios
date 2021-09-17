package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated = new Date();
    public ArrayList<MenuItem> items = new ArrayList<MenuItem>();

    public Menu(ArrayList<MenuItem> someItems, Date LastUpdated) {
        this.items = someItems;
        this.lastUpdated = lastUpdated;
    }

    public void addItem(MenuItem itemToAdd) {
        this.items.add(itemToAdd);

    }


    public void printMenu() {
        for (MenuItem i : items) {
            System.out.println(i);
        }
    }


    public MenuItem printSingleItem(MenuItem item) {
        return item;
    }
}
