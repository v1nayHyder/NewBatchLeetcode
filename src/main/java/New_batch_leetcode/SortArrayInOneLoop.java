package New_batch_leetcode;

import java.util.Arrays;

public class SortArrayInOneLoop {
    static void sortArray(int elements[]){
        int temp;
        int i=0,j=1;
        while (i<elements.length-1){
            if (elements[i]<elements[j]){
                   temp=elements[i] ;
                   elements[i]=elements[j];
                   elements[j]=temp;
            }
            j++;
            if (j>elements.length-1){
                System.out.println(j+"---"+elements.length);
                i++;
                j=i+1;
            }
        }
        System.out.println(Arrays.toString(elements));
    }
    public static void main(String[] args) {
        int elements[]={10,5,15,20,2};
        sortArray(elements);
        System.out.println("min value : "+elements[0]+"\nmax value : "+elements[elements.length-1]);
    }
}
