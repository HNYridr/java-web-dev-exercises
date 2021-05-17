package org.launchcode.java.studios.studioFourRestaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args){
        MenuItems newItem1 = new MenuItems(5.99, "ChickenFish", "Dinner", true);
        MenuItems newItem2 = new MenuItems(0.99, "Old Boot chunk", "Appetiser", true);
        MenuItems newItem3 = new MenuItems(45.00, "Blowfish", "Dinner", true);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItems> startingMenu = new ArrayList<>();

        Menu myMenu = new Menu(today, startingMenu);

        myMenu.addItem(newItem1);
        myMenu.addItem(newItem2);
        myMenu.addItem(newItem3);

        myMenu.printMenu();



    }

}
