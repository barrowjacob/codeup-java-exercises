import java.util.Scanner;

public class sandbox {

    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);

//           //create a program that outputs 10 numbers entered into console
           System.out.println("Please enter 10 numbers");
              int totalNums = 0;
              for (int i = 0; i < 10; i++) {
                     Integer n = scanner.nextInt();
                     totalNums += n;
              }

           System.out.println("Your grand total is: " + totalNums);
    }
}
