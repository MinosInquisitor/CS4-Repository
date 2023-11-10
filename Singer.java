
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String name) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0.0;
        this.favoriteSong = null;
    }
    public void performForAudience(int numberOfPeople) {
        noOfPerformances++;
        earnings += (numberOfPeople*100.0);
    }
    public void changeFavSong(Song newFavoriteSong) {
        favoriteSong = newFavoriteSong;
    }
    public String getName() {
        return name;
    }
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
    public double getEarnings() {
        return earnings;
    }
    public Song getFavoriteSong() {
        return favoriteSong;
    }
}
