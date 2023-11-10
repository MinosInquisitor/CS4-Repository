/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4.cs4qtr1project;

/**
 *
 * @author rtmuro
 */
public class Singer {
    // Fields
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0; // Static field to count all performances

    // Constructor
    public Singer(String name) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0.0;
        this.favoriteSong = null;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter method for noOfPerformances
    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    // Getter method for earnings
    public double getEarnings() {
        return earnings;
    }

    // Getter and Setter methods for favoriteSong
    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    // Static method to get totalPerformances
    public static int getTotalPerformances() {
        return totalPerformances;
    }

    // Method to perform for an audience
    public void performForAudience(int numberOfPeople) {
        noOfPerformances++;
        earnings += (numberOfPeople * 100.0);
        totalPerformances += 1;
    }

    // Overloaded method to perform with another Singer
    public void performForAudience(int numberOfPeople, Singer partner) {
        // Split the profit evenly between the two singers
        double profitPerSinger = (numberOfPeople * 100.0) / 2;
        earnings += profitPerSinger;
        partner.earnings += profitPerSinger;
        noOfPerformances++;
        partner.noOfPerformances++;
        totalPerformances += 1;
    }

    // Method to change the favorite song
    public void changeFavSong(Song newFavoriteSong) {
        favoriteSong = newFavoriteSong;
    }
}
