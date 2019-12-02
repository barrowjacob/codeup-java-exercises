package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
        public String getString() {
            return scanner.next();
        }

        boolean yesNo() {
            System.out.println("Please enter \"yes/ y\"");
            String newYes = getString();
            return newYes.equalsIgnoreCase("yes") || newYes.equalsIgnoreCase("y");
        }

        public int getInt(int min, int max) {
            System.out.printf("Please enter number between %s and %s", min, max);
            int number = getInt();

            if (number < min)
                return getInt(min, max);
            else if (number > max)
                return getInt(min, max);
            return number;
        }

        public int getInt() {
            System.out.println("enter number");
            return Integer.parseInt(getString());
        }

        public double getDouble(int min, int max) {
            double number = getDouble();
            if (number < min)
                return getDouble(min, max);
            else if (number > max)
                return getDouble(min, max);
            return number;
        }

        public double getDouble(){
            System.out.println("enter number");
           return Integer.parseInt(getString());
        }
}


