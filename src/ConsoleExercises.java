import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately: %.2f",  pi);
//    }

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("@");


//        System.out.print("Enter an integer: ");
//        Integer userNum = scanner.nextInt();
//        System.out.println("You entered the number --> " + userNum);

        System.out.println("Enter three word: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.print(firstWord + "\n");
        System.out.print(secondWord + "\n");
        System.out.print(thirdWord + "\n");
//

        scanner.nextLine();
//
//        System.out.print("Write a sentence, please.");
//        String thisSentence = scanner.nextLine();
//        System.out.print(thisSentence);

//
//        System.out.print("Enter length, width and height");
//        String classLength = scanner.nextLine();
//        String classWidth = scanner.nextLine();
//        String classHeight = scanner.nextLine();
//        float newLength = Float.parseFloat(classLength);
//        float newWidth = Float.parseFloat(classWidth);
//        float newHeight = Float.parseFloat(classHeight);
//        System.out.print(2* newLength + 2* newWidth + "\n");
//        System.out.print(newLength * newWidth + "\n");
//        System.out.print(newLength * newWidth * newHeight + "\n");




    }

}