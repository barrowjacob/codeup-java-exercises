package Sand.madlibs;

        //since it's abstract, you can't instantiate it specifically--only its subclasses
abstract class FillThisIn {
        //these can be set public because there's no real information to protect in a madlib...
    public String name;
    public String color;
    public String randomObject;
    public String location;

    //since it's abstract, you can't instantiate here--only its subclasses can instantiate it
    public abstract String greeting();
    public abstract String goToLocation();
    public abstract String pickUpObject();

}
