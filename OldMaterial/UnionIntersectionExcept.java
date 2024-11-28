package OldMaterial;
public class UnionIntersectionExcept {
//    Find the union intersection of two list and also find except (remove even
//    elements from list1 and odd elements from list2)

//    Input
//    List 1: 1,3,4,5,6,8,9
//    List 2: 1,5,8,9,2

//    Union: 1,3,4,5,6,8,9,2
//    Intersection: 1,5,8,9
//    Except: 1,3,5,9,8,2
    public static void main(String[] args) {
        int[] list1={1,3,4,5,6,8,9};
        int[] list2={1,5,8,9,2};
        int i,j;
        boolean nonRepeating=true;

        System.out.print("Union: ");
        for(i=0;i<list2.length;i++){
            for(j=0;j<list1.length;j++){
                if(i==0)
                    System.out.print(list1[j]+" ");
                if(list2[i]==list1[j]){
                    nonRepeating=false;
                    if(i!=0)
                        break;
                }
            }
            if(nonRepeating)
                System.out.print(list2[i]+" ");
            nonRepeating=true;
        }
        System.out.println();

        System.out.print("Intersection: ");
        for(i=0;i< list1.length;i++){
            for(j=0;j< list2.length;j++){
                if(list1[i]==list2[j])
                    System.out.print
                            (list1[i]+" ");
            }
        }
        System.out.println();

        System.out.print("Except: ");
        i=0;j=0;
        while (j< list2.length){
            if(i< list1.length){
                if(list1[i]%2!=0)
                    System.out.print(list1[i]+" ");
                i++;
            }
            else{
                if(list2[j]%2==0)
                    System.out.print(list2[j]+" ");
                j++;
            }
        }

    }
}
