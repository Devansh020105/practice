import java.util.Scanner;

public class SumOfEachRow {
    public static void sum(int[][] arr){
        Scanner sc = new Scanner(System.in);
        int startPoint = sc.nextInt();
        for (int i =startPoint;i<arr.length;i++){
            int sum =0;
            for (int j=0;j<arr.length;j++){
                sum = arr[i][j]+sum;
            }
            System.out.println("the sum of "+i+"th row is "+sum);
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        sum(arr);
    }
}
