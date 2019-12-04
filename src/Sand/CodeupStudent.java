package Sand;

public class CodeupStudent extends Student{

    public CodeupStudent(String[] information, boolean graduated){
        this.firstName = information[0];
        this.lastName = information[1];
        this.cohort = information[2];
        this.computer = information[3];
        this.graduated = graduated;
    }

    public void greeting() {
        System.out.println("Hello from " + cohort);
    }
    public void study() {
        System.out.println("I'm studying on my " + computer);
    }
    public boolean giveBusinessCards() {
        return graduated;
    }

}
