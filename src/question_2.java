public class question_2 {
    public static int[] Sort012(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                int temp=arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,2,0,2,2,0,0};
        arr=Sort012(arr);
        for (int i =0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
