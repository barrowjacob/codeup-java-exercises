package Sand;

import java.util.Arrays;
import java.util.Scanner;

public class warmup {


    public static String letterChanges(String str) {
        if (str == null || str.isEmpty()) return str;
        String str1 = new String();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'Z') {
                str1 += (char) 65;
            } else if (str.charAt(i) == 'z') {
                str1 += (char) 97;
            } else {
                str1 += (char) (str.charAt(i)+1);
            }
        }


        //for loop to convert char
        return str1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(letterChanges(sc.nextLine()));
    }
}
