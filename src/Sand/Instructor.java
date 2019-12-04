package Sand;

//abstract classes exist FOR THE SAKE of subclasses.
//any class that is super class can be an abstract class,
//---BUT---
//if you make it an abstract class, you CAN'T USE IT on its own.
//you can only use the subclasses of the abstract class.

    public class Instructor extends Employee{
        public Instructor(String name){
            this.name= name;
    }

    public String getName(){
            return name;
    }
    public void doWork(){
        System.out.println("teaching minds..");
    }
    public void readTraction(){
        System.out.println("Did not read Traction...");
    }
}
