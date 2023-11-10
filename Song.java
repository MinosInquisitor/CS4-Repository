/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4.cs4qtr1project;

/**
 *
 * @author rtmuro
 */
public class Song {

    // Fields
    private String title;
    private String artist;
    private int duration; // Duration in seconds
    private String genre;
    private int releaseYear;

    // Constructor
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    // Getter and Setter methods for each field
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    // Method to play the song
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    // Method to pause the song
    public void pause() {
        System.out.println("Pausing " + title);
    }

    // Method to stop the song
    public void stop() {
        System.out.println("Stopping " + title);
    }

    // Method to get song information
    public String getSongInfo() {
        return "Title: " + title + "\nArtist: " + artist + "\nDuration: " + duration + " seconds\nGenre: " + genre
                + "\nRelease Year: " + releaseYear;
    }
}
    

