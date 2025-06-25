public class counting {
    public static void count(int n){
        if(n==1){
            System.out.println(n+" ");
            return ;
        }

        count(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        int n = 5;
        count(n);
    }
}
