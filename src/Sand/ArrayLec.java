package Sand;
import java.util.Arrays;

public class ArrayLec {
    public static void main(String[] args) {
        //one way you can assign arrays (makes a reference to the array object, rather than creating)
//        String[] cheeses = new String[4];
//        cheeses[0] = "red";
//        cheeses[1] = "red";
//        cheeses[2] = "red";
//        cheeses[3] = "red";

        //it's more common to do it this way, but without "new String[]"
        // so: String[] cheeses = {"one","two","three","four"};
        String[] cheeses = new String[]{"one","two","three","four"};

        for(String cheese : cheeses) {
            System.out.println(cheese);
        }

        //TESTING THE Arrays.fill method
            int[] nums = new int[6];

            Arrays.fill(nums, 17);
            //you can override it if you do it beneath it
            nums[3] = 9;

            for(int n : nums) {
                System.out.println(n);
            }

        //TESTING THE Arrays.equals method
            int[] nums2 = {17, 17, 17, 17, 4};

            //compares the VALUES inside the array(including length and elements)
            System.out.println(Arrays.equals(nums, nums2));

        //TESTING THE Arrays.copyOf(array, length);
        //command + c, essentially
            int[] nums3 = Arrays.copyOf(nums, 6);
            System.out.println(Arrays.equals(nums, nums3));

            //if you want to assign more values to new array, change array length and then create conditional loop
            nums3 = Arrays.copyOf(nums, 15);
            for (int n : nums3) {
                if (n == 0) {
                    n = 17;
                }
                System.out.println(n);
            }

        //TESTING OUT THE Arrays.toString method;
        //makes a string rep of the array
            System.out.println(Arrays.toString(nums3));

        //TESTING OUT THE Arrays.sort method;
        //sorts in ascending order (also works alphabetically)
            Arrays.sort(nums3);
            System.out.println(Arrays.toString(nums3));
    }
}
