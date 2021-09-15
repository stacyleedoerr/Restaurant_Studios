package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList menuItems;
    private Date lastUpdate;

    public Menu(ArrayList items, Date dateUpdated) {
        this.menuItems = items;
        this.lastUpdate = dateUpdated;
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void addItem(MenuItem item){

    }
    public void removeItem(MenuItem item) {

    }
    public void printItem (MenuItem item) {

    }
    public void printMenu(){

    }

    public string printLastUpdate(){

    }


}
