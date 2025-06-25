import java.util.Scanner;

public class DiagonalAndBoundriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
            return;
        }
        int[][] arr = new int[n][n];
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int totalSum =0;
        for (int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                if (i==0||i==n-1||j==0||j==n-1){
                    totalSum += arr[i][j];
                } else if (i==j||i + j == n - 1) {
                    totalSum += arr[i][j];
                }
            }
        }
        //if (n > 1) {
          //  totalSum -= (arr[0][0] + arr[0][n - 1] + arr[n - 1][0] + arr[n - 1][n - 1]);
        //}
        System.out.println(totalSum);
    }
}
