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

public class Item {
    private final String name;
    private final String type;
    private final double cost;
    private static ArrayList<Item> completeItemList = new ArrayList<>();

    public Item(String name, String type, double cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        completeItemList.add(this);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public static Item getItem(int index) {
        if (index >= 0 && index < completeItemList.size()) {
            return completeItemList.get(index);
        } else {
            return null; // Return null for an invalid index
        }
    }

    public static void printAllItems() {
        for (Item item : completeItemList) {
            System.out.println(item); // Using the overridden toString method
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nType: %s%nCost: %.2f%n", name, type, cost);
    }
}

