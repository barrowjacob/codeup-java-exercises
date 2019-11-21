import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number of your choosing");
        long userInput = scanner.nextInt();

        System.out.print("number | squared | cubed \n");
        System.out.print("-------|---------|-------\n");
        for (long i = 1; i < userInput; i++) {
            System.out.print(i + "      |    " + i*i + "     |    " + i*i*i +"\n");
        }
    }
}