import java.util.Scanner;

public class MethodsExercise {

//
//    public static int addition(int one, int two) {
//        return one + two;
//        }
//        public static int subtraction(int one, int two) {
//        return one - two;
//        }
//        public static int multiplication(int one, int two) {
//            int newOne = 0;
//            for (int i = 0; i < two; i++) {
//                newOne += one;
//            }
//            return newOne;
//
//        }
////    public static void count(int one, int two) {
////        if (two == 0) {
////            System.out.println("All done!");
////            return;
////        }
////        int newOne = 0;
////        System.out.println(newOne);
////            count(newOne += one);
////    }
//
////    public static void main(String[] args) {
////        count(one);
////    }
//
//        public static int division(int one, int two) {
//        return one/two;
//        }
//        public static int modulo(int one, int two) {
//        return one % two;
//        }
//

        public static int getInteger(int min, int max) {
            System.out.println("Please enter a number between 1 and 10");
            Scanner scanner = new Scanner(System.in);

            int newInput = scanner.nextInt();
            do {
                if (newInput < max && newInput > min) {
                    System.out.println("Great! " + newInput + " is in range!");
                } else {
                    System.out.println("Lameo face guy. Do better.");
                    newInput = scanner.nextInt();
                }
            } while (newInput > max || newInput < min);
            return newInput;
        }

    public static void main(String[] args) {
//        System.out.println(addition(1,1));
//            System.out.println(subtraction(4,1));
//            System.out.println(multiplication(3,4));
//            System.out.println(division(4,2));
//            System.out.println(modulo(4,3));
        System.out.println(getInteger(1, 10));
        }
    }