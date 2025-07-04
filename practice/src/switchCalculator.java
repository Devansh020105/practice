import java.util.Scanner;

public class switchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operator = sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result =0 ;
        switch (operator){
            case "+":
                result = num1 +num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 % num2;
                break;
        }
        System.out.println(result);

    }
}
