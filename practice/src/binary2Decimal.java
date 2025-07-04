import java.util.Scanner;

public class binary2Decimal {
    public static int decimal(String str){
        int len = str.length();
        int p2 = 1;
        int num =0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                num = num + p2;
            }
            p2 = 2*p2;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(decimal(str));
    }
}
