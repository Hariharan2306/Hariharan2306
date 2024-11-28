// contains Collections framework

// Input:
// 5
// LDUUU

// Output:
// -1 2
public class DroidJourney {
    public static void main (String[] args) {
        System.out.println(droidJourney(5,"LDUUU"));
    }
    public static String droidJourney(int n,String s){
        int i,j;
        int[] op = {0,0};
        for(i=0;i<s.length();i++){
            if(s.charAt(i) == 'L')
                op[0]--;
            else if(s.charAt(i) == 'R')
                op[0]++;
            else if(s.charAt(i) == 'U')
                op[1]++;
            else
                op[1]--;
        }
        return op[0]+""+op[1];
    }
}