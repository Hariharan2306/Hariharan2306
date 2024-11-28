package SystemDesign.BankDesign.src;
import java.io.*;
import java.util.Scanner;
public class TransactionFileHandler {
    public void writeTransaction(int customerId,Transaction transaction){
        String fileName=customerId+".txt";

        BufferedWriter bfw=null;
            try {
                File file = new File(fileName);
                if (!file.exists()) {
                    file.createNewFile();
                }
                bfw=new BufferedWriter(new FileWriter(file,true));
                bfw.write(transaction.toString()+"\n");
                bfw.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
    }
    public int getLastTransactionId(int customerId){
        String fileName=customerId+".txt";

        Scanner s=new Scanner(fileName);
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                return 0;
            }
            String data="";
            while (s.hasNext())
                data=s.nextLine();
//            System.out.println();
            s.close();

        Transaction transaction=StringSplitter(data);
        return transaction.transactionId;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    private Transaction StringSplitter(String data){
        String[] arr=data.split(" ");
//        System.out.println(data);
//                System.out.println(arr[0]);
//        System.out.println(arr[1]);
        Transaction transaction=new Transaction(Integer.parseInt(arr[0]),
                arr[1],
                Double.parseDouble(arr[2]),
                Double.parseDouble(arr[3]));
        return transaction;
    }
}
