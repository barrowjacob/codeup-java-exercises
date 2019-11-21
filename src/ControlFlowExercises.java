import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 100");
        byte userNum = scanner.nextByte();
        if (userNum > 88) {
            System.out.println("You got an 'A'!");
        } else if (userNum >= 80) {
            System.out.println("You got a B");
        } else if (userNum > 67) {
            System.out.println("You got a C");
        } else if (userNum > 60) {
            System.out.println("You got a D");
        } else {
            System.out.println("You got an F.");
        }
    }
}