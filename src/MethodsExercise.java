import java.util.Scanner;

public class MethodsExercise {

    public static int addition(int one, int two) {
        return one + two;
        }
        public static int subtraction(int one, int two) {
        return one - two;
        }
        public static int multiplication(int one, int two) {
        return one * two;
        }
        public static int division(int one, int two) {
        return one/two;
        }
        public static int modulo(int one, int two) {
        return one % two;
        }
        public static void main(String[] args) {
        System.out.println(addition(1,1));
            System.out.println(subtraction(4,1));
            System.out.println(multiplication(3,1));
            System.out.println(division(4,2));
            System.out.println(modulo(4,3));

        }
    }
