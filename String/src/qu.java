import java.util.Scanner;

public class qu{
    public static String Remove(String str){
        String result = " ";
        for (int i =0;i<str.length();i++){
            if(i == str.length() - 1 ||str.charAt(i)!=str.charAt(i+1)){
                result = result + str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = Remove(str);
        System.out.print(result);

    }
}
