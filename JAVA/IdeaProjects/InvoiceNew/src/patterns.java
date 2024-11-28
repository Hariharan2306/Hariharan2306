import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        int a[]={7,2,2,3,6,1};
        for(int i=0 ; i<a.length;i++) {
        int flag = 1;
        if (a[i] == -1) {
        continue;
        }
        for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
            flag += 1;
            a[j] = -1;
        }
    }
    System.out.println( flag);
}}}