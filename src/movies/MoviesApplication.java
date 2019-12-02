package movies;
import java.util.Scanner;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do? \n" +
                " 0 - Exit \n" +
                " 1 - view all movies \n" +
                " 2 - view animated movies \n" +
                " 3 - view drama movies \n" +
                " 4 - view horror movies \n" +
                " 5 - view scifi movies");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput == 0) {
            return;
        } else if (userInput == 1) {
            MoviesArray.findAll();
            for (MoviesArray mov : Movie) {
                System.out.println(mov.);
            }
        }
        }
    }


