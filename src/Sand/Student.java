package Sand;

abstract class Student {
    //properties that all (students) should have
    //don't know how to fill these in until you get to specific students
    protected String firstName;
    protected String lastName;
    protected String cohort;
    protected String computer;
    protected boolean graduated;

    public abstract void greeting();
    public abstract void study();
    public abstract boolean giveBusinessCards();

}
