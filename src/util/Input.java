package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
        public String getString() {
            return scanner.next();
        }
        boolean yesNo() {
            String newYes = scanner.next();
            return newYes.equalsIgnoreCase("yes") || newYes.equalsIgnoreCase("y");
        }
        public int getInt(int min, int max) {
                System.out.printf("Please enter a number between %s and %s", min, max);
                boolean sandwich = true;
                int newInput = scanner.nextInt();
                while(sandwich) {
                    if (newInput > min && newInput < max) {
                        System.out.println("YOU DID IT!");
                        sandwich = false;
                        return newInput;
                    } else if (newInput > max) {
                        System.out.printf("Your guess was %s. Please guess LOWER (between 1 and 10).", newInput);
                    } else {
                        System.out.printf("Your guess was %s. Please guess HIGHER (between 1 and 10).", newInput);
                    } newInput = scanner.nextInt();
            } return newInput;
        }
        public int getInt() {
            System.out.printf("enter number");
            int userInputs = scanner.nextInt();
            System.out.println(userInputs);
            return userInputs;
        }

    public double getDouble(double minny, double maxy) {
        System.out.printf("Please enter a number between %s and %s", minny, maxy);
        boolean sandwiches = true;
        double newInputs = scanner.nextDouble();
        while(sandwiches) {
            if (newInputs > minny && newInputs < maxy) {
                System.out.println("YOU DID IT!");
                sandwiches = false;
                return newInputs;
            } else if (newInputs > maxy) {
                System.out.printf("Your guess was %s. Please guess LOWER (between 1 and 10).", newInputs);
            } else {
                System.out.printf("Your guess was %s. Please guess HIGHER (between 1 and 10).", newInputs);
            } newInputs = scanner.nextDouble();
        } return newInputs;
    }
    public double getDouble(){
        System.out.println("enter number");
            double doubleInput = scanner.nextDouble();
        System.out.println(doubleInput);
        return doubleInput;
    };


}


