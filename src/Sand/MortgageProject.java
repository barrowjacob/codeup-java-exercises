package Sand;
import java.util.*;
import java.text.*;
import java.lang.*;


//the following is a fun little mortgage project based upon a tutorial video from Programming with Mosh (on Youtube)

//************//
//INSTRUCTIONS//
//************//

// create 3 CLI prompts that ask the user for PRINCIPAL, ANNUAL INTEREST RATE, and LENGTH OF TERM (# of years to pay off loan)
// utilizing Scanner class, mortgage calculations (google it) and NumberFormat.getCurrencyInstance,
// output the monthly mortgage payment with dollar sign and decimal places.

public class MortgageProject {

    public static void newMortgage() {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner sc = new Scanner(System.in);

        System.out.println("Principal: ");
        double principal = sc.nextDouble();
        System.out.println("Annual Interest Rate: ");
        float annualInterest = sc.nextFloat();
        double monthlyInterest = (annualInterest / MONTHS_IN_YEAR / PERCENT);

        System.out.println("Period (Years): ");
        byte lengthOfLoan = sc.nextByte();

        int totalNumberOfPayments = lengthOfLoan * MONTHS_IN_YEAR;
        double onePlusRToTheNthPower = Math.pow((1 + monthlyInterest), totalNumberOfPayments);
        double monthlyMortgage = principal * (monthlyInterest * onePlusRToTheNthPower)/(onePlusRToTheNthPower - 1);

        String realMonthlyPayment = NumberFormat.getCurrencyInstance().format(monthlyMortgage);

        System.out.println("Your expected monthly payment is: " + realMonthlyPayment);
    }

    public static void main(String[] args) {
        newMortgage();
    }
}


