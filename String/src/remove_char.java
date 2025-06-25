import java.util.Scanner;

public class remove_char {
    public static StringBuilder remove(String str, char ch){
        StringBuilder result = new StringBuilder();
        for (int i =0;i<str.length();i++){
            if (str.charAt(i)!= ch){
                    result.append(str.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word :");
        String str = sc.nextLine();
        System.out.println("enter the letter to be removed");
        char ch = sc.next().charAt(0) ;
        StringBuilder result = remove(str,ch);
        System.out.println(result);
    }
}
