import java.util.Scanner;

public class power {
    public static int powers(int n, int x ){
        if(n==0){
            return 1;
        }

        return x * powers(n-1,x);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(powers(n,x));
    }
}
