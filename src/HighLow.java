import java.util.Scanner;
import java.util.Random;

public class HighLow {
   public static void guesser(int min, int max) {
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
       Random rando = new Random();
       String winner = "Nice. You got the right answer!";
       int rando_val = rando.nextInt(max) + min;
       System.out.printf("Welcome! Guess a number between %s and %s!", min, max);
       int userInput = sc.nextInt();
       Boolean youWin = false;
       int guessCounter = 0;
        int remainingGuesses = 10;

       //begin the guessing
       while (!youWin) {
           remainingGuesses--;
           if (userInput == rando_val) {
               guessCounter++;
               youWin = true;
               System.out.printf("%s%n It took you %s guesses!%n Thanks for playing my game!%n", winner, guessCounter);
               return;
           } else if (userInput < rando_val && userInput > min) {
               guessCounter++;
               remainingGuesses--;
               System.out.printf("%n*********************%nYou have %s guesses remaining.%n*********************%n%n", remainingGuesses);
               if (guessCounter == 1) {
                   System.out.printf("Nope. Guess higher. %nThat was your first guess. %nThere may still be some hope.%n");
               } else { System.out.printf("Nope. Guess higher. You are at %s guesses. No pressure.%n", guessCounter);}
           } else if (userInput > rando_val && userInput < max) {
               remainingGuesses--;
               guessCounter++;
               System.out.printf("%n*********************%nYou have %s guesses remaining.%n*********************%n%n", remainingGuesses);
               if (guessCounter == 1) {
                   System.out.printf("Nope. Guess lower. %nThat was your first guess. %nThere may still be some hope.%n");
               } else { System.out.printf("Nope. Guess lower. You are at %s guesses. No pressure.%n", guessCounter);}
           } else {
               remainingGuesses--;
               guessCounter++;
               System.out.printf("%n*********************%nYou have %s guesses remaining.%n*********************%n%n", remainingGuesses);
               if (guessCounter == 1) {
                   System.out.printf("Look.%nBruh.%nI told you to guess between 1 and 10.%nThat simple. That was your first guess. Try again.%n");
               } else {
                   System.out.printf("Why do you do this to yourself? %nPlease guess between the numbers of 1 and 10.%nThat makes %s guesses. Try again.%n", guessCounter);
               }
           }
           userInput = sc.nextInt();
       }
   }

   public static void main(String[] args) {
        guesser(1,10);
    }

}
