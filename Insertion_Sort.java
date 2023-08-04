package SORTING_TECHNIQUES;
import java.util.Arrays;
public class Insertion_Sort {
    static void InsertionSort(int[] n){
        for(int i=0;i<n.length-1; i++){
            for(int j=i+1;j>0;j--){
                if(n[j]>n[j-1]){
                   break;
                }
                else{
                    int temp=n[j-1];
                    n[j-1]=n[j];
                    n[j]=temp;
                }}}}
    public static void main(String[] args) {
        int[] a={1,2,7,0,-1,3};
        System.out.println("Original Array: "+Arrays.toString(a));
        InsertionSort(a);
        System.out.println("After Sorting the Array: "+Arrays.toString(a));

    }
}