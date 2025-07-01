import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ispalindrom = true  ;
        int i ,j;
        for(i =0;i<arr.length/2;i++) {
            if(arr[i]!=arr[arr.length - 1 - i]){
                ispalindrom = false;
                break;
            }
        }
        if(ispalindrom){
            System.out.println("it is a palindrom");
        }
        else {
            System.out.println("it is not a palindrom");
        }
    }
}

