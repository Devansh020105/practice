import java.util.Scanner;

public class function {
    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("enter the number of cols");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i =0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.println("enter the element at "+ i +"th row and "+ j + "th cols" );
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void print2darray(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i=0;i<rows;i++){
            for (int j =0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] input = takeInput();
        print2darray(input);

    }
}
