public class selection_sorting {
    public static void printarray(int[] a){
        for(int i = 0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        int numbers[] = new int[]{7,8,3,1,2};
        System.out.print("Original Array:  ");
        printarray(numbers);
        for(int i= 0;i<numbers.length;i++){
            int sindex= i; //index of smallest element in arrray (at first assuming 0th element as the smallest
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]<=numbers[sindex]){
                    sindex=j;}
            }
            int temp=numbers[i];
            numbers[i]=numbers[sindex];
            numbers[sindex]=temp;
                }
        System.out.print("Sorted Array:  ");
        printarray(numbers);
            }
        }

