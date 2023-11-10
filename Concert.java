/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4.cs4qtr1project;

/**
 *
 * @author rtmuro
 */
public class Concert {
    // Fields
    private String concertName;
    private String venue;
    private String date;
    private String singer;

    // Constructor
    public Concert(String concertName, String venue, String date, String singer) {
        this.concertName = concertName;
        this.venue = venue;
        this.date = date;
        this.singer = singer;
    }

    // Getter and Setter methods for concertName
    public String getConcertName() {
        return concertName;
    }

    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }

    // Getter and Setter methods for venue
    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    // Getter and Setter methods for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Getter and Setter methods for singer
    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}    

