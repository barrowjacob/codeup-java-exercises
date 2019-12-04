package Sand.madlibs;

public class RunMadLibs {
    public static void main(String[] args) {
        String[] words = {"Papi","maroon","musket","Watering Hole"};
    Version1 ver1 = new Version1(words);
        System.out.println("Once upon a time, there was this mang. We called him " + ver1.name);
        System.out.println("Say hello, " + ver1.name);
        System.out.println("\"" + ver1.greeting() + "\"");
        System.out.println(ver1.goToLocation() + " recently...");
        System.out.println("He saw a really great thing on the ground. What was it, you ask? It was a " + ver1.randomObject);
        System.out.println(ver1.pickUpObject());
        System.out.println("Then he put it back down and went home to drink some coffee...");
    }

}
