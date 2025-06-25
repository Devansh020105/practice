public class question1 {
    public static void min(int[] arr){
        int min =0;
        for(int i =0; i<arr.length;i++) {
            for (int j=0;j<arr.length;){
                if (arr[j]<arr[i]){
                    min = arr[j];
                }
                j++;
            }
        }
        System.out.println(min);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        min(arr);
    }
}
