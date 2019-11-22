import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Say hi");
           String input = scanner.nextLine();
            do {
                if (input.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (input.endsWith("!")) {
                    System.out.println("Whoa! Chillout broham!");
                } else if (input.trim().equals("")) {
                    System.out.println("Fine. Be that way.");
                } else {
                    System.out.println("Whatever.");
                }
                //reassign input so it has a new prompt to run off of
                input = scanner.nextLine();
            } while (!input.equals("..."));
        }
    }

