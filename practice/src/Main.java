import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String str = sc.nextLine();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        System.out.println(result);

        if( str.equals(result)){
            System.out.println("it is pallindrom");
        }
        else{
            System.out.println("it is not palindrom");
        }
    }
}