import java.io.*;
public class FileHandling2 {
    public static void main(String[] args) throws Exception{
        File file=new File("dum.txt");
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(file));
        os.writeObject("hello");
        os.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        String op=(String) ois.readObject();
        ois.close();
        System.out.println(op);

    }
}