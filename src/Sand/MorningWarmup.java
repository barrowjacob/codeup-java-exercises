package Sand;
import java.util.*;
import java.io.*;
public class MorningWarmup {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something");
        String userInput = sc.nextLine();
        String reversedInput = "";
        for (int i = userInput.length()-1; i >= 0; i--) {
            reversedInput += userInput.charAt(i);
        }
        System.out.println(reversedInput);
    }

}
