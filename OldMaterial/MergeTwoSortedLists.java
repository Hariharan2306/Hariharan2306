package OldMaterial;
import java.util.LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]

        LinkedList<Integer> l1 =new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);

        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(1);
        l2.add(3);
        l2.add(4);

//        int a=l2.get(0);
//        System.out.println(a);
        System.out.println(mergeTwoLists(l1,l2));
    }
    static int mergeTwoLists(LinkedList<Integer> l1,LinkedList<Integer> l2){
        LinkedList <Integer> l3=new LinkedList<>();
        int i=0,j=0;

        while(i<l1.size() && j<l2.size()){
            if(l1.get(i) <= l2.get(j))
                l3.add(l1.get(i++));
            else
                l3.add(l2.get(j++));
        }
        while(i < l1.size())
            l3.add(l1.get(i++));

        while (j < l2.size())
            l3.add(l2.get(j++));

//        for(i=0;i<l3.size();i++)                  //to print list 3
//            System.out.print(l3.get(i)+" ");
//        System.out.println();
        return l3.get(0);
    }
}
