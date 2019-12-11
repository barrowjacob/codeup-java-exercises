package grades;

import java.util.HashMap;
import java.util.Scanner;
public class GradesApplication {



    public static void main(String[] args) {

        Student john = new Student("john");
        john.addGrade(45);
        john.addGrade(55);
        john.addGrade(65);

        Student jahn = new Student("jahn");
        jahn.addGrade(45);
        jahn.addGrade(45);
        jahn.addGrade(55);

        Student jehn = new Student("jehn");
        jehn.addGrade(45);
        jehn.addGrade(95);
        jehn.addGrade(35);

        Student jihn = new Student("jihn");
        jihn.addGrade(45);
        jihn.addGrade(25);
        jihn.addGrade(65);


        HashMap<String, Student> usernames = new HashMap<>();
        usernames.put("flamingBird123", john);
        usernames.put("flamingBird223", jahn);
        usernames.put("flamingBird323", jehn);
        usernames.put("flamingBird423", jihn);

        while (true) {
            System.out.println("Which student would you like to see more info about: " + usernames.keySet());
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            if (usernames.get(userInput) != null) {
                System.out.printf("Name: %s - Github Username: %s \nCurrent GPA: %.2f", usernames.get(userInput).getName(), userInput, usernames.get(userInput).getAverageGrade());
                System.out.println("Would you like to see another student?");
                userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no")) {
                    break;
                }
            } else {
                System.out.println("That username does not exist.");
            }
        }
    }

}

// prompt for name of foodItem
    //store as userInput1

// prompt for category of foodItem
    //store as userInput2

// prompt with 3 diff cats
    //store response as userInput3

// object constructor:
    // name of foodItem == userInput1
    // quantity == userInput2
    // category == userInput3

// arrayList to hold objects

//


//