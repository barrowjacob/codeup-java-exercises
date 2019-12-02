import java.util.Random;
public class ServerNameGenerator {

    public static String randomName(String[] arrayName) {
        Random randy = new Random();
        int arrayIndex = randy.nextInt(arrayName.length);
        return arrayName[arrayIndex];
    }

    public static void main(String[] args) {
        String[] adjectiveArray = new String[]{"spicy","saucy","hangry","silly","fire-breathing","razzmatazical","nAndy", "fashionable-like-Nico","tough-like-JW","weak"};
        String[] nounArray = new String[]{"blender","duck","putty","television","cups","eraser","Roger's-ballcap","carpet","tables","Snorlax"};
        System.out.println(randomName(adjectiveArray) + "-" + randomName(nounArray));
    }

}
