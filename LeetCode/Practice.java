package LeetCode;

import java.io.BufferedReader;
import java.io.FileReader;

public class Practice {
    public static void main(String[] args) throws Exception {
      String File = "IntPractice/Bank/bank_db.txt";
      BufferedReader bfr = new BufferedReader(new FileReader(File));
      String line = bfr.readLine();
      int words = 0;
      while(line != null){
         words++;
         for(char c : line.toCharArray()){
            if(c == ' ')
               words++;
         }
         line = bfr.readLine();
      }
      bfr.close();
      System.out.println(words);
    }    
}
