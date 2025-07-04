import java.util.Arrays;
import java.util.Scanner;

    public class merge_2sorted {
        public static int[] input1(int n) {
            int arr[] = new int[n];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            return arr;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = input1(n);
            int[] arr2 = input1(m);
            int[] temp = new int[n+m];

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int i = 0, j = 0, k = 0;
            while (i < n && i < m){

            }

        }
    }
