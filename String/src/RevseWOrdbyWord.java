import java.util.Scanner;

public class RevseWOrdbyWord {
    public static String reverse(String str){
        String result = " ";
        int i = str.length()-1;
        int end = str.length();
        while(i>=0){
            if (str.charAt(i)==' '){
                result = result + str.substring(i+1,end) + " ";
                end = i;
            }
            i--;
        }
        result = result + str.substring(i+1, end);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result  = reverse(str);
        System.out.println(result);
    }
}
