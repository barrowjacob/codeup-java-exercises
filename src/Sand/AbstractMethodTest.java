package Sand;

public class AbstractMethodTest {
    public static void main(String[] args) {
            //first, create array for student
    String[] student1 = {"Jacos","Spaghetti","Deimy","Mac"};
            //then create student object
    CodeupStudent jacos = new CodeupStudent(student1, true);
            //now you can call student methods
    jacos.greeting();
    jacos.study();
    System.out.println(jacos.giveBusinessCards());
    }
}
