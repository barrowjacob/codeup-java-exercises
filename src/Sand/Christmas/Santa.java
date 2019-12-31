package Sand.Christmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Santa {

    static Scanner sc = new Scanner(System.in);

    static ArrayList wishList = new ArrayList();

    public static Reindeer[] deer = new Reindeer[9];

    public static void addReindeer() {
        deer = Arrays.copyOf(deer, deer.length + 1);
    }
    static HashMap<String, String> wishers = new HashMap<>();
    static String userInput;
    static String newUserInput;
    public static void main(String[] args) {
        int j = 0;
        while (j < 3) {
            System.out.println("What would you like for Christmas?");
            userInput = sc.nextLine();
            System.out.println("What is your name?");
            newUserInput = sc.nextLine();
            if (!userInput.equals("")) {
                wishers.put(userInput, newUserInput);
                j++;
            }
        }
        System.out.println(wishers);

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

//added new user, database and table through mysql. finished
// all but bonus on january 2/3.
