import java.util.ArrayList;
public class Ticket_Details {
    private int ticketCount;
    private String movieTime;
    private String movieName;
    private int ticketRate;
    private String[] seatNumber;

    public static ArrayList<Ticket_Details> tickets = new ArrayList<>();

    public Ticket_Details(int ticketCount, String movieTime,
                          String movieName, int ticketRate, String[] seatNumber) {
        this.ticketCount = ticketCount;
        this.movieTime = movieTime;
        this.movieName = movieName;
        this.ticketRate = ticketRate;
        this.seatNumber = seatNumber;
    }

    public int getTicketCount() {
        return ticketCount;
    }
    public String getMovieTime() {
        return movieTime;
    }
    public String getMovieName() {
        return movieName;
    }
    public int getTicketRate() {
        return ticketRate;
    }
    public String[] getSeatNumber() {
        return seatNumber;
    }
}
