public class question3 {
    public static int[] sum_arr(int[]arr1,int[]arr2){
        int n = arr1.length;
        int m = arr2.length;
        int carry =0;
        int[] arr = new int[n+1];
        int O = arr.length;
        for (int i = n-1; i>=0; i--){
            for (int j = m-1; j>=00;j-- ) {
                for (int k = n-1;k>=O;k--){
                    int sum = arr1[i] + arr2[j] + carry;
                    carry = sum / 10;
                    int num = sum%10;
                    arr[k]= num;
                }

            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5};
        int [] arr2 ={9,8,7,6};
        int[] arr = sum_arr(arr1,arr2);
        for (int i =0; i<=9;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
