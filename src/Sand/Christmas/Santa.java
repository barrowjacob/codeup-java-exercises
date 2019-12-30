package Sand.Christmas;


import java.util.Scanner;

public class Santa {
static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("What would you like for Christmas?");
            String userInput = sc.nextLine();
            if (!userInput.equals("")) {
                break;
            }
        }
    }
}
