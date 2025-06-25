import java.util.Scanner;

public class largstColSum {
    public static void maxSum(int[][] arr){
            Scanner sc = new Scanner(System.in);
            int max=0;
            for (int i =0;i<arr.length;i++){
                int sum =0;
                for (int j=0;j<arr.length;j++){
                    sum = arr[i][j]+sum;
                }
                if(sum >max){
                    max =sum;
                }

            }
        System.out.println("maximum sum amongst the rows is " + max);
        }
        public static void main(String[] args) {
            int[][] arr = {
                    {11,22,33},
                    {4,5,6},
                    {7,8,9}
            };

            maxSum(arr);
        }
    }

