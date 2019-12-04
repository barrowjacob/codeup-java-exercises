package Sand.madlibs;

public class Version1 extends FillThisIn {

    public Version1(String[] words){
        this.name = words[0];
        this.color = words[1];
        this.randomObject = words[2];
        this.location = words[3];
    }
    public String greeting(){
        return "I wish I had a hot dog...";
    }
    public String goToLocation() {
        return name + " went to the " + location;
    }
    public String pickUpObject() {
        return "He grabbed the " + randomObject;
    }

}
