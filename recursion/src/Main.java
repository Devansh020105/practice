//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static int factorial(int n) {

        //base case
        if(n==0){
            return 1;
        }

        int choti = factorial(n-1);

        return n*choti;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int ans = factorial(n);
        System.out.println(ans);
    }
}