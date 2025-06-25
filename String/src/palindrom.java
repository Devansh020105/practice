import java.util.Scanner;

public class palindrom {
    public static boolean Palaindrom(String str){

        for (int i =0;i<=str.length();i++){
            for (int j = str.length()-1;j>0;j--){
                if (str.charAt(i)!=str.charAt(j)){
                    return false;
                }
                else {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Palaindrom(str));

    }
}
