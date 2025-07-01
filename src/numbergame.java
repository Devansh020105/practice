import java.util.Scanner;
import java.util.Random;
public class numbergame {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100)+1;
        int trial =1 ;
        int max_trials = 5;
        boolean guessedcurrectly =  false;
        while(trial <=5 ){
        System.out.println("give your " + trial + " number");
        int n = sc.nextInt();
        trial++;

            if(n==num){
                System.out.println("CORRECT U WIN CONGRATES");
                guessedcurrectly = true;
                break;
            }

            else if (n<num) {
                System.out.println("TOO LESS");
            }
            else{
                System.out.println("TOO HIGH");
            }

        }
        if(!guessedcurrectly) {
            System.out.println("OOOOOOOOHHHHHHHHHH loooooooooooooooooser NO TRIAL LEFT THE CORRECT NUMBER WAS " + num );
        }
    }
}
