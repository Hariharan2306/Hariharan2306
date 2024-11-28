package LeetCode.DP;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleList {
// Example 1:
// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    public static void main(String[] args) {
        int n = 5,i=0,j=0;
        List<List<Integer>> op = new ArrayList<List<Integer>>();
        
        while(i<n){
            if(i == 0 || i == 1){
                List<Integer> el = new ArrayList<Integer>();
                while(j<=i){
                    el.add(1);
                    j++;
                }
                op.add(el);
                j=0;
            }
            else{
                op.add(pascal(op.get(i-1)));
            }
            i++;
        }
        System.out.println(op);
    }
    private static List<Integer> pascal(List<Integer> list){
        List<Integer> el = new ArrayList<Integer>();
        int i=1;
        el.add(1);
        while(i<list.size()){
            el.add(list.get(i-1)+list.get(i));
            i++;
        }
        el.add(1);
        return el; 
    }
}