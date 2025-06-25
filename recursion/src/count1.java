public class count1 {
        public static int count(int n){
            if(n==0)return 0;
            int small = count(n/10);
            int ans = small+1;
            return ans;
        }
        public static void main(String[] args) {
            int n = 1243;
            System.out.println(count(n));
        }
    }
