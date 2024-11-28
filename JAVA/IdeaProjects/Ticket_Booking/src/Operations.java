import java.util.Scanner;

public class Operations {
    public void booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name ");
        String movieName = sc.next();
        System.out.println("Enter show timing 'hr : min' ");
        String time = sc.next();

        Shows shows = Db.movieNames.get(movieName);
        if(shows == null){
            System.out.println("No such show Exists");
            return;
        }

        if(! shows.getMovieTime().equals(time)){
            System.out.println("Not available at given time ");
            return;
        }

        if(! shows.getAvailability()){
            System.out.println("House Full ");
            return;
        }
        System.out.println("Enter number of Tickets ");
        int tickets = sc.nextInt();
        if(tickets > 100){
            System.out.println("Fool motha tickets eh 100 thaan da");
            return;
        }

        int op1 = 0;
        while( op1 != 1){
            System.out.println("Cost for "+tickets+" tickets is "+Shows.costPerTic*tickets+" Rupees" +
                    "\n Enter 1 to continue" +
                    "\n Enter 2 to erase progress ");
            op1 = sc.nextInt();
            if(op1 == 2) {
                System.out.println("Thank You");
                return;
            }
        }
        String[] seatNo = addingTickets(shows,tickets);
        if(seatNo[0] == null)
            return;

        // now create obj for ticket details
        Ticket_Details t = new Ticket_Details(tickets, shows.getMovieTime(), shows.getMovieName(),Shows.costPerTic*tickets,seatNo);
        Ticket_Details.tickets.add(t);
        System.out.println("to View ant details of your booking enter Booking ID as required , " +
                "\n your Booking Id -- "+Ticket_Details.tickets.size());
    }
    String[] addingTickets(Shows shows,int tickets){
        String[] seatNo = new String[tickets];

        if(! shows.getAvailability())
            return seatNo;

        int i,j,k=0;
        boolean tempAvail = true,flag = true;
        for(i=0;i<shows.seats.length;i++){
            for(j=0;j<shows.seats[0].length;j++){
                if(shows.seats[i][j] == 0)
                    k++;
                if(k == tickets+1) {
                    System.out.println("hi");
                    flag = false;
                    break;
                }
            }
            if(! flag)
                break;
        }
        System.out.println(k+" k");
        if(k < tickets){
            System.out.println("Not Enough tickets available, Only "+k+" tickets available ");
            return seatNo;
        }else if(k != tickets+1){   //not even one extra ticket available
            tempAvail = false;
        }

        k=0;    //actual booking
        System.out.println("Booked Tickets -- ");

        for(i=0;i<shows.seats.length && k < tickets;i++){
            for(j=0;j<shows.seats[0].length && k< tickets;j++){
                if(shows.seats[i][j] == 0){
                    char temp = (char) (i+'A');
                    seatNo[k] = temp +""+ j;
                    System.out.print(seatNo[k++]+", ");
                    shows.seats[i][j] =1;
                }
            }
        }
        System.out.println("\n Booking Completed ");
        shows.setAvailability(tempAvail);
        
        return seatNo;
    }
    public void ticketDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Booking ID ");
        int bookingId = sc.nextInt();

        Ticket_Details data = Ticket_Details.tickets.get(bookingId -1);
        if(data == null){
            System.out.println("No Such Booking ID Exists -- try again ");
            return;
        }
        System.out.println(data.getMovieName()+
                "\n"+ data.getMovieTime()+
                "\n"+ data.getTicketCount()+
                "\n"+ data.getTicketRate());
        String[] seats = data.getSeatNumber();

        for(int i=0;i< seats.length;i++)
            System.out.print(seats[i]+" ");
        System.out.println();
    }
}