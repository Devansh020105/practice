import java.util.Scanner;

public class largest_element {
    public static int[] input(int n){
        int arr[] = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int largest  =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = input(n);
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("largest element in an array is "+largest);

    }
}
