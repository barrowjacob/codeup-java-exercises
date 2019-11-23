import java.util.Scanner;
import java.util.Random;

public class HighLow {
    int i = 0;
    static Scanner sc = new Scanner(System.in);
    static Random rando = new Random();
    static int rando_val;
    static String winner = "Nice. You got the right answer!";

    public static void guesser(int min, int max){
        System.out.printf("Welcome! Guess a number between %s and %s!", min, max);
        int userInput = sc.nextInt();
        rando_val = rando.nextInt(max) + min;
        //begin the guessing
        if (userInput == rando_val) {
            System.out.println("I can't believe it! You guessed the number!");
            return;
        } else if (userInput < rando_val) {
            System.out.println("Nope. Guess higher.");
            guesser(min, max);
        } else if (userInput > rando_val) {
            System.out.println("Nope. Guess lower.");
            guesser(min, max);
        } else {
            System.out.printf("No, I said type a number between %s and %s. Gosh. Try again.", min, max);
            guesser(min,max);
        } System.out.println(winner + "\nThanks for playing my game! Come again soon!!");
    };


    public static void main(String[] args) {
        guesser(1,10);




    }

}
