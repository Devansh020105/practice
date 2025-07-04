import java.util.Scanner;

public class remove_duplicate {
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
        int[]arr= input(n);
        int[]newArr = new int[n];
        for(int i =0;i<arr.length;i++){

        }
    }
}
