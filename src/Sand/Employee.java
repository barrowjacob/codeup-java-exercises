package Sand;

        //set abstract because you're never going to be only an 'employee', you're always going to have a specific role.

        //abstract FORCES subclasses to use the methods set in the super class.

        //it's a blueprint to ensure EVERY subclass HAS to use the methods below...

abstract class Employee {
    protected String name;

    public Employee() {
        System.out.println("Creating employee..");
    }

    public void greeting() {
        System.out.println("Hola");
    }
//method must have "abstract" so it can only be used by subclasses
    public abstract void doWork();
            //readTraction is set because all employees must do it, but some read it on a computer, some in paper form...
    public abstract void readTraction();
}
