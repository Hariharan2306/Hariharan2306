import java.io.*;
public class BufferedReaderAndBufferedWriter {
    public static void main(String[] args) throws Exception{
        File sample=new File("Sample new.txt");
        BufferedWriter bfw=null;
        bfw=new BufferedWriter(new FileWriter(sample,true));
        bfw.write("helloo,, ");
        bfw.close();


//        bfw=new BufferedWriter(new FileWriter(sample,true));
//        bfw.write("#hi");
//        bfw.close();
        BufferedReader bfr =new BufferedReader(new FileReader(sample));
                String[] op;
//        BufferedReader bfr=new BufferedReader(new FileReader(sample));
//        if(bfr.readLine()==null)
//            System.out.println("empty");
        op=bfr.readLine().split("#");
        bfr.close();
        int i=0;
        while (i<op.length)
            System.out.println(op[i++]);
    }
}
