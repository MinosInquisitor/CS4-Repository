
public class Main {

    public static void main(String args[]) {
        Song song1 = new Song("FillerSong", "FillerArtist");
        Song song2 = new Song("FillerSong2", "FillerArtist2");
        
        Singer singer = new Singer ("FillerArtist");
        singer.changeFavSong(song1);
        singer.performForAudience(12);
        
        System.out.println("Singer Name: " + singer.getName());
        System.out.println("Number Of Performances: " + singer.getNoOfPerformances());
        System.out.println("Total Earnings: $" + singer.getEarnings());
        System.out.println("Favorite Song" + singer.getFavoriteSong().getTitle());
        
        singer.changeFavSong(song2);
        System.out.println("\nSinger's New Favorite Song: " + singer.getFavoriteSong().getTitle());
    }
}
