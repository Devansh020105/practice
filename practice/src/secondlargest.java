import java.util.Scanner;

public class secondlargest {
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
        int arr[] = input(n);
        if (arr.length < 3) {
            System.out.println("Array must have at least 3 elements.");
        }
        int first=Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int num = arr[i];
            if(num>first){
                third = second;
                second = first;
                first = num;
            }
            else if(num>second && num!=first){
                third = second;
                second = num;
            }
            else if(num>third && num!=second && num != third){
                third = num;
            }
        }
        System.out.println("largest element is "+ first + " second largest is "+ second +" third largest element is " + third  );

    }
}
