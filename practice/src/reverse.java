import java.util.Scanner;

public class reverse {
    public static int[] input(int n){
        int arr[] = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr=input(n);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
