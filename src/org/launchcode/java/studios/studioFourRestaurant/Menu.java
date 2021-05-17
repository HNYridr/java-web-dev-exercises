package org.launchcode.java.studios.studioFourRestaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItems> items;

    public Menu(Date lastUpdated, ArrayList<MenuItems> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItems> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItems> items) {
        this.items = items;
    }

    public ArrayList<MenuItems> removeItem(MenuItems item){
        int toBeRemoved = -1;
        for (int i = 0; i < items.size(); i++){
            if(items.get(i).equals(item)){
                toBeRemoved = i;
            }
        }
        this.items.remove(toBeRemoved);
        return this.items;
    }

    public ArrayList<MenuItems> addItem(MenuItems item){
       this.items.add(item);
       return this.items;
    }

    public String menuUpdated(){
        return("the menu was last updated on" + this.lastUpdated);
    }

    public void printMenu(){
        for (MenuItems item : items) {
            System.out.println(item.getDescription());
        }
    }

    public void printItem(MenuItems items){
        System.out.println(items.getDescription());
    }
}
