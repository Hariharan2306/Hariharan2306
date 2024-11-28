package OldMaterial;

public class SortBasedOnFreq {
    //sort based on freq of occurrence(freq)
    //if same occurrence check original element sort them(asc)
    public static void main(String[] args) {
        int[] a={0,2,1,-1,1,2,0,4,-1,4};
        int[] freq=new int[a.length];
        int i,j,temp,temp1;

        for(i=0;i< a.length;i++){//to find freq
            for (j=0;j<a.length;j++){
                if(a[i]==a[j])
                    freq[j]++;
            }
        }

        for(i=0;i<a.length-1;i++){//sort
            for(j=0;j< a.length-1-i;j++){
                if(freq[j] < freq[j+1]){
                    temp=freq[j];      temp1=a[j];
                    freq[j]=freq[j+1]; a[j]=a[j+1];
                    freq[j+1]=temp;    a[j+1]=temp1;
                }
                else if(freq[j]==freq[j+1])
                    if(a[j] >= a[j+1]){
                        temp1=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp1;
                    }
            }
        }

        for (i=0;i< freq.length;i++)//print
            System.out.print(a[i]+" ");
    }
}
