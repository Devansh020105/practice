public class CheckSortedArray {
    public static boolean Check(int[]arr){
        if(arr.length<=1){
            return true;
        }
        if (arr[0]>arr[1]){
            return false;
        }
        int SmallInput[] = new int [arr.length-1];
        for (int i =0;i<arr.length;i++){
            SmallInput[i] = arr[i+1];
        }
        boolean smallAns = Check(SmallInput);
        return smallAns;
    }
    public static void main(String[] args) {
        int ans[] ={9,2,7,3,4};
        Check(ans);
    }
}
