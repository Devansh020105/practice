public class Sencond_lrgest {
    public static void SecondLargest(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {45, 77, 9, 3, 4, 56};
        SecondLargest(arr);
        System.out.print(arr[arr.length-2]);

    }
}