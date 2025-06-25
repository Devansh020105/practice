public class Rotate_by_reversal {
    public static int[] reverse(int[] arr) {
        int reverse[] = new int[arr.length];
        for (int j = arr.length-1; j >= 0; j--) {
            for (int i = 0; i <= arr.length-1; i++) {
                arr[j] = reverse[i];
            }
        }
        return reverse;
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 1, 5, 9, 8};
        reverse(arr);
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
