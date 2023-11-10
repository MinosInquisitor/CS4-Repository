/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4.exercise05;

/**
 *
 * @author Ricardo Muro
 */

import java.util.ArrayList;


public class Store {
    private final String name;
    private double earnings;
    private final ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList<>();

    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    public Store(String name) {
        this.name = name;
        this.earnings = 0;
        this.itemList = new ArrayList<>();
        storeList.add(this);
    }

    public String getName() {
        return name;
    }

    public double getEarnings() {
        return earnings;
    }

    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    public void sellItem(int index) {
        if (index >= 0 && index < itemList.size()) {
            Item item = itemList.get(index);
            earnings += item.getCost();
            System.out.println("Sold " + item.getName() + " for P" + item.getCost());
            itemList.remove(index);
        } else {
            System.out.println("There are only " + itemList.size() + " items in the store.");
        }
    }

    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    public void sellItem(String itemName) {
        boolean itemFound = false;
        for (Item item : itemList) {
            if (item.getName().equals(itemName)) {
                earnings += item.getCost();
                System.out.println("Sold " + item.getName() + " for P" + item.getCost());
                itemList.remove(item);
                itemFound = true;
                break;
            }
        }

        if (!itemFound) {
            System.out.println("The store doesn't sell " + itemName);
        }
    }

    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    public void sellItem(Item item) {
        if (itemList.contains(item)) {
            earnings += item.getCost();
            System.out.println("Sold " + item.getName() + " for P" + item.getCost());
            itemList.remove(item);
        } else {
            System.out.println("The store doesn't sell " + item.getName());
        }
    }

    // add Item i to store's itemList
    public void addItem(Item item) {
        itemList.add(item);
    }

    // loop over itemList and print all items with the specified type
    public void filterType(String type) {
        System.out.println("Items of type " + type + ":");
        for (Item item : itemList) {
            if (item.getType().equals(type)) {
                System.out.println("Name: " + item.getName() + ", Type: " + item.getType() + ", Cost: P" + item.getCost());
            }
        }
    }

    // loop over itemList and print all items with a cost lower than or equal to the specified value
    public void filterCheap(double maxCost) {
        System.out.println("Items with cost less than or equal to P" + maxCost + ":");
        for (Item item : itemList) {
            if (item.getCost() <= maxCost) {
                System.out.println("Name: " + item.getName() + ", Type: " + item.getType() + ", Cost: P" + item.getCost());
            }
        }
    }

    // loop over itemList and print all items with a cost higher than or equal to the specified value
    public void filterExpensive(double minCost) {
        System.out.println("Items with cost greater than or equal to P" + minCost + ":");
        for (Item item : itemList) {
            if (item.getCost() >= minCost) {
                System.out.println("Name: " + item.getName() + ", Type: " + item.getType() + ", Cost: P" + item.getCost());
            }
        }
    }

    // loop over storeList and print the name and the earnings'Store.java'
    public static void printStats() {
        for (Store store : storeList) {
            System.out.println("Store: " + store.getName());
            System.out.println("Total Earnings: P" + store.getEarnings());
            System.out.println("=====================");
        }
    }
}

