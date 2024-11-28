package SystemDesign.Cabs;

import java.util.Scanner;

public class Main {
    // Booking only done
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        autoGenerateCabs();
        int op = 0;
        do{ 
            System.out.println("Enter 1 for booking ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    CabsOperations.bookCab();
                    break;
            
                default:
                    break;
            }
        }while(op!=0);
    }

    static void autoGenerateCabs(){  // 4 times
        int i;
        Cabs c;
        for(i=0;i<4;i++){
            c=new Cabs(i,"A","9:00",0);
            DB.cabs.put(i,c);
        }
    }
}
