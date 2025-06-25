public class BubbleSort {
    public static void BubbleSort(int[] input ){
        for(int i =0; i< input.length-1;i++){
            for (int j=0; j< input.length-1; j++){
                if(input[j]>input[j+1]){
                    int temp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int input[] ={45,77,9,3,4,56};
        BubbleSort(input);
        for (int i = 0; i<input.length; i++){
            System.out.print (input[i]+" ");
        }
    }
}
