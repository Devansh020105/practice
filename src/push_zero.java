public class push_zero {
    public static int[] Push_zero(int[]arr) {
        int temp[] = new int[arr.length];
        int j =0;
        int count=0;
        for(int i =0;i<arr.length;i++){
                if(arr[i]!=0) {
                    temp[j] = arr[i];
                    j++;
                }
                else{
                    count++;
                }
        }
        for (int i =1;i<=count;i++){
            temp[j]=0;
            j++;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr= {2,0,4,1,3,0,2,8};
        arr=Push_zero(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
