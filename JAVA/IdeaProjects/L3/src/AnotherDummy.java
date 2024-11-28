package JAVA.IdeaProjects.L3.src;

import java.io.*;
import java.util.Scanner;
public class AnotherDummy {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int i;//for loop
        String tempName;//to save names in a temp variable
        Dummy names[]=new Dummy[100];//object array
         //names[0]=new Dummy("hari");//also another way w/o using getter setter
        File file=new File("AnotherDummy1.txt");
        ObjectOutputStream oos=null;

        for(i=0;i< 5;i++){
            names[i]=new Dummy();//obj creating as per entries
            System.out.println("enter name ");
            tempName=sc.next();//scanning
            names[i].setName(tempName);//giving stored variable as argument to setter method
        }
        oos=new ObjectOutputStream(new FileOutputStream(file));//copying the final array obj called names in a file
        oos.writeObject(names);
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        names=(Dummy[]) ois.readObject();
        ois.close();

        for(i=0;i<5;i++)
            if(names[i].getName().equals("hari"))//printing using get method
                 System.out.println(i);
    }
}
