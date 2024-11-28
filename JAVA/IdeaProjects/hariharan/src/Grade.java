import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        //        datatype variableName = value;
//        int exampleVariableName = 1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your marks ");
            int mark_scored = scanner.nextInt();
            if (mark_scored >= 50) {
                //why not use Scanner in line 4 and use sc in line 5
                //also which word req caps like System,Scanner
                System.out.println("you're pass");
                if (mark_scored >= 90)
                    System.out.println("A");
                else if (mark_scored >= 75)
                    System.out.println("B");
                else
                    System.out.println("C");


            } else
                System.out.println("you've failed the exam ");

        }}

