import java.util.Scanner;
public class PainterDetails {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag=true;
        Painter []paintObj=new Painter[3];
        do {
            System.out.println("to enter painter details press 1");
            System.out.println("to search painter by id press 2");
            System.out.println("to view painters based on charge press 3");
            System.out.println("to exit press 4");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    registerPainter(paintObj);
                    break;
                case 2:
                    searchById(paintObj);
                    break;
                case 3:
                    SortedBasedOnCharge(paintObj);
                    break;
                case 4:
                    flag=false;
                    System.out.println("thank you");
            }
        }while(flag=true);
    }
    static void registerPainter(Painter []paintObj){
        for(int i=0;i<paintObj.length;i++){
            System.out.println("Enter details of Painter " + (i + 1));
            System.out.print("Enter id : ");
            int id = sc.nextInt();
            System.out.print("Enter name : ");
            String name = sc.next();
            System.out.print("Enter PhoneNumber : ");
            String phoneNumber = sc.next();
            System.out.print("Enter City : ");
            String city = sc.next();
            System.out.print("Enter charge per square feet : ");
            float charge = sc.nextFloat();
            System.out.println("\n");
            if(phoneNumber.length()==10 ) {
                paintObj[i] = new Painter(id, name, phoneNumber, city, charge);
                System.out.println("Details added successfully.");
            }else
                System.out.println("check your phone number.");
        }
    }
    public static void SortedBasedOnCharge(Painter[] paintObj) {
        Painter[] tempObj = paintObj;
        Painter temp = null;
        for (int i=0;i<tempObj.length-1; i++) {
            for (int j=0;j<tempObj.length-1-i; j++) {
                if (tempObj[j].getCharge() < tempObj[j+1].getCharge()) {
                    temp = tempObj[i];
                    tempObj[i] = tempObj[j];
                    tempObj[j] = temp;
                }
            }
        }
        for (int i = 0; i < tempObj.length; i++) {
            printUserDetails(tempObj[i]);
        }
    }
    private static void searchById(Painter[] paintObj) {
        System.out.print("Enter the painter id to display details : ");
        int id = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < paintObj.length; i++) {
            if (paintObj[i] == null) {
                continue;
            }
            if (id == paintObj[i].getId()) {
                printUserDetails(paintObj[i]);
                flag = true;
            }
        }
        if (flag == false)
            System.out.println("no painters found with the given id");
    }
    static void printUserDetails(Painter obj) {
        System.out.println("\n");
        System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getCity()+" "+obj.getPhoneNum()+" "+obj.getCharge());
    }
}