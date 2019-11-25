import java.util.Random;
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

//    public static long recusionMult(int one, int two) {
//        if (two == 0) {
//            return 0;
//        } else if (two == 1) {
//            return one;
//        } else if (two == 2) {
//            return one + one;
//        }
//        return one + recusionMult(one, two - 1);
//    }
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

//        public static int getInteger(int min, int max) {
//            System.out.println("Please enter a number between 1 and 10");
//            Scanner scanner = new Scanner(System.in);
//            int newInput = scanner.nextInt();
//            do {
//                if (newInput < max && newInput > min) {
//                    System.out.println("Great! " + newInput + " is in range!");
//                    continue;
//                } else {
//                    System.out.println("Lameo face guy. Do better.");
//                } newInput = scanner.nextInt();
//
//            } while (newInput > max || newInput < min);
//            return newInput;
//        }
//
//        public static Integer factorialMaker() {
//            System.out.println("Please enter an integer between 1 and 10");
//            Scanner scanner = new Scanner(System.in);
//            int newInput = scanner.nextInt();
//            System.out.println(newInput);
//            if (newInput < 10 && newInput > 0) {
//                System.out.println("Do you want to continue?");
//                String newNewInput = scanner.nextLine();
//                if (newNewInput.equalsIgnoreCase("yes")) {
//                    for (int i = newInput -1; i > 0; i--) {
//                        newInput *= (i);
//                    }
//                }
//            } else {
//                return factorialMaker();
//            }
//            return newInput;
//        }
//
//    static Scanner scanner = new Scanner(System.in);
//        public static void dice() {
//            System.out.println("Please enter how many sides are on your make believe dice!");
//            int diceSides = scanner.nextInt();
//            System.out.println(diceSides);
//            System.out.println("Would you like to roll? Yes or no");
//            String roll = scanner.next();
//            if (roll.equalsIgnoreCase("yes")) {
//                for (int i = 0; i < 2; i++) {
//                    Random diceRoll = new Random();
//                    int newDiceRoll = diceRoll.nextInt(diceSides - 1) + 1;
//                    System.out.println(newDiceRoll);
//                }
//            } else {
//                dice();
//            }
//        }
//
//

    public static String guess() {
        do {
            Random rando = new Random();
            int target = rando.nextInt(1000) + 25;
            System.out.println("Give me a number to guess!");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            if (userInput > target) {
                System.out.println("Guess lower!");
            } else if (userInput < target) {
                System.out.println("Guess higher");
            } else {
                System.out.println("You got it! WOW!");
                return "WOW BRO WOW";
            }
        } while(true);
    }






            public static void main(String[] args){
//        System.out.println(addition(1,1));
//            System.out.println(subtraction(4,1));
//            System.out.println(multiplication(3,4));
//            System.out.println(division(4,2));
//            System.out.println(modulo(4,3));
//            System.out.println(getInteger(1, 10));
//                System.out.println(recusionMult(4, 10));
//                System.out.println(factorialMaker());
//                dice();

            }

    }