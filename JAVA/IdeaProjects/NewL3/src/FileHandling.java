import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {
    //creating a file named demmo
    //writing txt as hi hari
    //reading file
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("demmo.txt");//ClassName fos is obj since creating file opSTream
        DataOutputStream dos=new DataOutputStream(fos);//since writing data in the file dataopstream
        dos.writeUTF("hi hari ");

        FileInputStream fis=new FileInputStream("demmo.txt");
        DataInputStream dis=new DataInputStream(fis);
        String ip=dis.readUTF();
        System.out.println(ip);
    }
}
