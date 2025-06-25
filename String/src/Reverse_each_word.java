import java.util.Scanner;

public class Reverse_each_word {
    public static String Revserse(String str) {
        StringBuilder result = new StringBuilder();
        int start = 0;
        for (int i = 0; i <= str.length(); i++)
            if (i == str.length() || str.charAt(i) == ' ') {
                for (int j = i - 1; j >= start; j--) {
                    result.append(str.charAt(j));
                }
                if (i != str.length()) {
                    result.append(" ");
                }
                start = i + 1;
            }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String str = sc.nextLine();
        String result = Revserse(str);
        System.out.println("Reverse each word: " + result);
    }
}
