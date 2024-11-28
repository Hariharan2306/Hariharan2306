import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        autoGenerateShows();
        Scanner sc = new Scanner(System.in);
        int op1;
        do{
            System.out.println("\n Enter 1 to view Shows details \n" +
                    "Enter 2 to Book Tickets \n" +
                    "Enter 3 to view Booking details \n" +
                    "Enter 4 to exit");
            op1 = sc.nextInt();
            switch (op1){
                case 1:
                    int op2;
                    do {
                        System.out.println("Enter 1 to search shows based on movies \n" +
                                "Enter 2 to search shows based on show timings ");
                        op2 = sc.nextInt();
                        if (op2 == 1) {
                            System.out.println("enter movie name ");
                            String movieName = sc.next();
                            Shows data = Db.movieNames.get(movieName);

                            if(data == null){
                                System.out.println("No Such movie try again ");
                                break;
                            }

                            System.out.println(movieName);
                            System.out.println(data.getMovieTime());
                            if(data.getAvailability())
                                System.out.println("Show available ");
                            else
                                System.out.println("House Full ");
                            break;
                        } else if (op2 == 2) {
                            System.out.println("Enter timing you are looking for [hr:min]");
                            String movieTime = sc.next();
                            Shows data = Db.movieTimes.get(movieTime);

                            if(data == null){
                                System.out.println("No shows available on such timing ");
                                break;
                            }

                            System.out.println(data.getMovieName());
                            System.out.println(movieTime);
                            if(data.getAvailability())
                                System.out.println("Show available ");
                            else
                                System.out.println("House Full ");
                            break;
                        }
                        else
                            System.out.println("Invalid Entry try again ");
                    }while(op2 != 1 || op2 != 2);
                    break;
                case 2:
                    Operations o = new Operations();
                    o.booking();
                    break;
                case 3:
                    o = new Operations();
                    o.ticketDetails();
                    break;
                default:
                    System.out.println("Enter valid Input ");
                    break;
            }
        }while(op1 != 4);
        System.out.println("Thank You ");
    }
    static void autoGenerateShows(){
        String []shows = {"Thunivu","Puss_in_the_boots","Avatar_the_way_of_water"};
        int[][] seats = new int[10][10];

        Shows o1 = new Shows("8:00",shows[0],true,seats);
        Db.movieNames.put(shows[0], o1);
        Db.movieTimes.put("8:00",o1);

        Shows o2 = new Shows("11:30",shows[1],true,seats);
        Db.movieNames.put(shows[1], o2);
        Db.movieTimes.put("11:30",o2);

        Shows o3 = new Shows("3:00",shows[2],true,seats);
        Db.movieNames.put(shows[2], o3);
        Db.movieTimes.put("3:00", o3);

        Shows o4 = new Shows("6:30",shows[0], true,seats);
        Db.movieNames.put(shows[0], o4);
        Db.movieTimes.put("6:30",o4);
    }
}