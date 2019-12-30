package Sand.Christmas;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOf;
import Sand.Christmas.Reindeer;

public class Santa {
static Scanner sc = new Scanner(System.in);

public static Reindeer[] deer = new Reindeer[9];
public static void addReindeer() {
    deer = Arrays.copyOf(deer, deer.length + 1);
}

    public static void main(String[] args) {

        while (true) {
            System.out.println("What would you like for Christmas?");
            String userInput = sc.nextLine();
            if (!userInput.equals("")) {
                break;
            }
        }
        Reindeer dean = new Reindeer("dean", 0);
        Reindeer james = new Reindeer("james", 1);
        Reindeer sam = new Reindeer("sam", 2);
        Reindeer tim = new Reindeer("tim", 3);
        Reindeer fred = new Reindeer("fred", 4);
        Reindeer leon = new Reindeer("leon", 5);
        Reindeer mick = new Reindeer("mick", 6);
        Reindeer lionel = new Reindeer("lionel", 7);
        Reindeer comet = new Reindeer("comet", 8);
        Reindeer cupid = new Reindeer("cupid", 9);
        Reindeer donner = new Reindeer("donner", 10);


        System.out.println("Here are all the deer in the array: ");
        System.out.println(deer.length);
        for (Reindeer reindeer : deer) {
            System.out.println(reindeer.name);
        }


    }
}
