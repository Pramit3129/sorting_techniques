public class bubble_Sorting {
    public static void main(String[] args){
        int numbers[] = new int[]{2,5,3,1,6};
        for(int i =0 ; i<numbers.length;i++){
        System.out.print(numbers[i]+" ");}
        System.out.println(" ");
        for(int i = 0 ; i<(numbers.length-2);i++){
            for(int j =0; j<(numbers.length-1-i);j++){
                if(numbers[j] > numbers[j+1]){
                    int k = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=k;}
                }
            }
        for(int i =0 ; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");}
        }
    }

