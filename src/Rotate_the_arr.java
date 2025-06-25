public class Rotate_the_arr {
    public static int[] Rotate_arr(int d, int[] arr) {
        int n = arr.length;
        while (d != 0) {
            int temp = arr[0];
            for (int i = 0; i < n-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n-1] = temp;
            d--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 1, 5, 9, 8};
        int d = 2;
        Rotate_arr(d, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//REVERSE METHOD ----------------------------------------------------------------------

