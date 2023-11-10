/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cs4.cs4qtr1project;

/**
 *
 * @author rtmuro
 */


public class CS4Qtr1Project {

    public static void main(String[] args) {
        // My Own Java Class - Concert 
        // Create three instances of the Concert class
        Concert concert1 = new Concert("Concert 1", "Venue 1", "2023-10-15", "Singer 1");
        Concert concert2 = new Concert("Concert 2", "Venue 2", "2023-11-20", "Singer 2");
        Concert concert3 = new Concert("Concert 3", "Venue 3", "2023-12-25", "Singer 3");

        // Display information for each concert
        System.out.println("Concert 1 Information:");
        System.out.println("Name: " + concert1.getConcertName());
        System.out.println("Venue: " + concert1.getVenue());
        System.out.println("Date: " + concert1.getDate());
        System.out.println("Singer: " + concert1.getSinger());

        System.out.println("\nConcert 2 Information:");
        System.out.println("Name: " + concert2.getConcertName());
        System.out.println("Venue: " + concert2.getVenue());
        System.out.println("Date: " + concert2.getDate());
        System.out.println("Singer: " + concert2.getSinger());

        System.out.println("\nConcert 3 Information:");
        System.out.println("Name: " + concert3.getConcertName());
        System.out.println("Venue: " + concert3.getVenue());
        System.out.println("Date: " + concert3.getDate());
        System.out.println("Singer: " + concert3.getSinger());
    
           
        
        // Create two instances of the Song class
        Song song1 = new Song("Song 1", "Artist 1");
        Song song2 = new Song("Song 2", "Artist 2");

        // You can use the getter methods to access song information
        System.out.println("Song 1 Information:");
        System.out.println(song1.getSongInfo());

        System.out.println("\nSong 2 Information:");
        System.out.println(song2.getSongInfo());

        // Play the songs
        System.out.println("\nPlaying Songs:");
        song1.play();
        song2.play();
        
    // Create an instance of the Singer class
        Singer singer1 = new Singer("John");
        Singer singer2 = new Singer("Alice");

        // Create an instance of the Song class and assign it as the favorite song
        Song favoriteSong = new Song("Favorite Song", "Favorite Artist");
        singer1.setFavoriteSong(favoriteSong);
        singer2.setFavoriteSong(favoriteSong);

        // Have the Singers perform together for 12 people and split the profit
        singer1.performForAudience(12, singer2);

        // Display Singer's information after the performance
        System.out.println("Singer 1 Name: " + singer1.getName());
        System.out.println("Number of Performances (Singer 1): " + singer1.getNoOfPerformances());
        System.out.println("Total Earnings (Singer 1): $" + singer1.getEarnings());

        System.out.println("\nSinger 2 Name: " + singer2.getName());
        System.out.println("Number of Performances (Singer 2): " + singer2.getNoOfPerformances());
        System.out.println("Total Earnings (Singer 2): $" + singer2.getEarnings());

        // Change the favorite song of Singer 1
        Song newFavoriteSong = new Song("New Favorite Song", "New Favorite Artist");
        singer1.changeFavSong(newFavoriteSong);

        // Display Singer 1's new favorite song
        System.out.println("\nSinger 1's New Favorite Song: " + singer1.getFavoriteSong().getTitle());

        // Display the total number of performances
        System.out.println("\nTotal Performances: " + Singer.getTotalPerformances());
    
    }
}

    

