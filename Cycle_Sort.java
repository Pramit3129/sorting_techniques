package SORTING_TECHNIQUES;

import java.util.Arrays;

public class Cycle_Sort {
    static void CycleSort(int[] n, boolean PositionStartsWith0) {
        int pt=0;
        if(PositionStartsWith0){
            while(pt<n.length){
                int crtpos=n[pt]-1;
                if(n[pt]!=n[crtpos]){
                    swap(n,pt,crtpos);
                }
                else{
                    pt++;
                }
            }
        }
        else{
            while(pt<n.length){
                int crtpos=n[pt];
                if(n[pt]!=n[crtpos]){
                    swap(n,pt,crtpos);
                }
                else{
                    pt++;
                }
            }
        }
    }
    static void swap(int[] n, int first , int sec){
        int temp=n[first];
        n[first]=n[sec];
        n[sec]=temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {5,4,1,3,2}; // after sorting = [1,2,3,4,5] this means here position is starting from 0
        int [] arr2={0,6,2,4,1,3,5}; // here after sorting= [0,1,2,3,4,5,6] this means here every element is in it's own position i.e. Position not starting from 0
        System.out.println("Arr1 before Sorting: "+Arrays.toString(arr1));
        System.out.println("Arr2 before Sorting: "+Arrays.toString(arr2));
        CycleSort(arr1,true); // sorting the arr1 using CycleSort technique
        CycleSort(arr2,false); //sorting the arr2 using CycleSort techniques
        System.out.println("Arr1 after Sorting: "+Arrays.toString(arr1));
        System.out.printf("Arr2 after Sorting: "+Arrays.toString(arr2));
    }
}