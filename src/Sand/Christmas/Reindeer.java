package Sand.Christmas;



import static Sand.Christmas.Santa.addReindeer;
import static Sand.Christmas.Santa.deer;


public class Reindeer {

    protected String name;
    protected int id;
    public Reindeer(String name, int num) {
        this.name = name;
        this.id = num;
        if (this.id > deer.length -1) {
            addReindeer();
            System.out.println("New deer slot added for " + this.name);
        }
        System.out.println("This deer's name is " + name);
        deer[num] = this;
        System.out.println(deer[num].name + " was added to the array at the index of " + num +  ".");

    }
}
