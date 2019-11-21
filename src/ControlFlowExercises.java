public class ControlFlowExercises {
    public static void main(String[] args) {
        for (long i = 2L; i < 1000000; i *= i) {
            System.out.println(i);
        }
    }
}