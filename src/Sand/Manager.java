package Sand;

public class Manager extends Employee{
            //must extend to make it work
            //MUST implement EVERY METHOD that super class "employee" implements

    public Manager(String name){
        this.name = name;
    }
    public void doWork(){
        System.out.println("Watches people...");
    }
            //utilizing abstract, each subclass uses different versions of the same method.
    public void readTraction(){
        System.out.println("Actually reading the book...");
    }


}
