package Sand;
import java.util.*;
import java.io.*;
public class MorningWarmup {


    public static double calculateBaseToExponent(int num1, int num2) {
        double newTotal = 1;
        for (int i = 1; i <= num2; i++) {
            newTotal *= num1;
        } return newTotal;
    }






    //1/9 warm up
public static int SimpleAdding(int num) {
    int newTotal = num;
    for (int i = num; i > 0; i--) {
        newTotal += (i - 1);
    }
    return newTotal;
}




    public static void main(String[] args) {
        System.out.println(calculateBaseToExponent(2,4));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter something");
//        String userInput = sc.nextLine();
//        String reversedInput = "";
//        for (int i = userInput.length()-1; i >= 0; i--) {
//            reversedInput += userInput.charAt(i);
//        }
//        System.out.println(reversedInput);
//        System.out.println(SimpleAdding(300));
    }

}
