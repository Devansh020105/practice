import java.util.Scanner;

class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number of row");
            int row = sc.nextInt();
            System.out.println("enter number of col.");
            int col = sc.nextInt();
            int [][]arr=new int[row][col];
            for (int i=0;i<row;i++){
                for (int j =0;j<col;j++){
                    System.out.println( "write number at" + i + "th row and" + j + "th position" );
                    arr[i][j]=sc.nextInt();
                }
            }
            for (int i=0;i<row;i++){
                for (int j =0;j<col;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
}