public class CheckNum {
    public static boolean Check(int[] arr,int n,int x){
        if(n== 0){
            return false;
        }
        if (arr[n - 1] == x) {
            return true;
        }
        return Check(arr, n-1,x);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n = arr.length;
        int x = 5;
        if(Check(arr,n,x)){
            System.out.println("present");
        }else {
            System.out.println("not present");
        }
    }
}
