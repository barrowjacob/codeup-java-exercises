package Sand;
import java.util.*;
import java.text.*;
//import these two all the time

public class References {

    //see https://introcs.cs.princeton.edu/java/11cheatsheet/ for a detailed cheat sheet on all things Java
    //it includes OOP, basic Java syntax, detailed commands for just about every package

    //also see Programming with Mosh on Youtube for amazing, hand-holding Java tutorials

    public static void sandwich() {
        System.out.println("Herein lies a sandwich...");
    }

    //this is an example of number formatting for currency
    //can also be used for percentages, etc.
    public static void practiceNumberFormatting() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(12348934.9348));
    }


    public static void main(String[] args) {
        sandwich();
        practiceNumberFormatting();

    }
}




