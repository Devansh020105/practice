public class fibonaxxi {
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int small = fibonacci(n-1) + fibonacci(n-2);
        return small;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibonacci(n));

    }
}
