import java.util.Scanner;

public class Main { public static int CountSpace(String str) {
    int wordCount =0;
    for (int i =0;i<str.length();i++){
        if (str.charAt(i)==' ') {
            wordCount++;
        }
    }
    wordCount++;
    return wordCount;

}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input =s.nextLine();
        System.out.println("word count : "+ CountSpace(input));

    }
}