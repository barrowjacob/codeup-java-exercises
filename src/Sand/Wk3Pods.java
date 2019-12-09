package Sand;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Wk3Pods {

    public static void main(String[] args) {

        //sout min and max of array
        int[] oldArray = {1,9,15,3,4,6,28,4,4,10,29,10000};
        Arrays.sort(oldArray);
        String newArray = Arrays.toString(oldArray);
        System.out.printf("The sorted array is: %s %n", newArray);
        System.out.printf("Min: %s | Max: %s %n", oldArray[0], oldArray[oldArray.length-1]);

        // ================= NEXT EXERCISE ===================== //


        //if array contains 7, sout "bang", else sout "no 7's";
        System.out.println("\n===== Next Exercise =====\n");
        int[] secondArray = {25,4,19,995,7,300,17,372,1};

        boolean found = IntStream.of(secondArray).anyMatch(s -> s == 7);
        if (found) {
            System.out.println("Bang!");
        } else {
            System.out.println("No 7's");
        }
    }
}
