public class Shows {
    public static final int costPerTic = 190;
    private String movieTime;
    private String movieName;
    public boolean availability;
    public int[][] seats;
    public Shows(String movieTime, String movieName,boolean availability,int[][] seats) {
        this.movieTime = movieTime;
        this.movieName = movieName;
        this.availability = availability;
        this.seats = seats;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getMovieTime() {
        return movieTime;
    }
    public String getMovieName() {
        return movieName;
    }
    public boolean getAvailability() {
        return availability;
    }
}