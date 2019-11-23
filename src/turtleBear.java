import java.util.Scanner;
import java.util.Random;

public class turtleBear {
    static String userName;
    static String enemyName;
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void sleepy(int num) {
        try {
            Thread.sleep(num);
        } catch (Exception e) {
            System.out.println("yep");
        }
    }

    //set everything up
    public static void settingUp() {
        System.out.printf("Greetings individual! What is your name?%n");
        userName = sc.next();
        System.out.printf("%s, eh?", userName);
        sleepy(1000);
        System.out.printf("%nExcellent. %nNow tell me, %s.", userName);
        sleepy(1000);

        do {
            System.out.printf("%nDo you want to cheat and make your own enemy or play fairly and just let us do the talking? %nType \"CHEAT\" or \"PLAY FAIR\"%n", userName, userName);
            String userCheat = sc.next();
            if (userCheat.equalsIgnoreCase("cheat")) {
                System.out.printf("*Sigh* Okay, %s. Have it your way.%n", userName);
                characterCreation();
                return;
            } else if (userCheat.equalsIgnoreCase("play fair")) {
                newJourney();
                return;
            } else {
                userCheat = sc.next();
            }
        } while (true);
    }

    public static void characterCreation() {
        System.out.printf(" Please tell me your of your might. Strength: (1-10)%n", userName);
        byte userStrength = sc.nextByte();
        System.out.printf("And how fast are you? Speed: (1-10)%n");
        byte userSpeed = sc.nextByte();
        System.out.printf("What of your vitality? HP: (1-10)%n");
        byte userHealth = sc.nextByte();
        if (userStrength == 10 && userSpeed == 10 && userHealth == 10) {
            System.out.printf("%n...%n");
            sleepy(1000);
            System.out.printf("Seriously %s.", userName);
            sleepy(1000);
            System.out.printf("%nYou gave yourself all 10's?");
            sleepy(1500);
            System.out.printf("%nWell, whatever. Let's keep going.%n%n");
        }
        ;
        sleepy(1500);

        System.out.printf("Tell me, mighty warrior: %nWhat is the name of the foe you will face in glorious combat? Name: %n");
        enemyName = sc.next();
        System.out.printf("And what is %s's strength? Strength: (1-10)%n", enemyName);
        byte enemyStrength = sc.nextByte();
        System.out.printf("And what of their speed? Speed: (1-10)%n");
        byte enemySpeed = sc.nextByte();
        System.out.printf("Is their health even comparable to yours? HP: (1-10)%n");
        byte enemyHealth = sc.nextByte();
        if (enemyStrength == 1 && enemySpeed == 1 && enemyHealth == 1) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("yep");
            }
            System.out.printf("......%n%n");
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println("yep");
            }
            System.out.printf("You really aren't going to make this game very fun if you keep cheating like this.%n%n");
            sleepy(3000);

            System.out.printf("Okay! Well, there we go.");
            sleepy(1000);
            System.out.printf("%nTwo mighty warriors preparing to face battle.");
            sleepy(1000);
            System.out.printf("%nLet's make sure I heard you correctly: %n%n");
            sleepy(2000);

            System.out.printf("--------------  %n %s's Stats: %n -----------%n Strength: %s %n Speed: %s %n HP: %s %n ==============%n", userName, userStrength, userSpeed, userHealth);
            sleepy(5000);
            System.out.printf("%s's Stats: %n -------------- %n Strength: %s %n Speed %s %n HP %s %n -----------%n%nIs this all correct?%n", enemyName, enemyStrength, enemySpeed, enemyHealth);
            String userConfirm = sc.next();
            if (userConfirm.equalsIgnoreCase("yes")) {
                sleepy(1000);
                System.out.printf("%n%nAt last! %s, it is time to begin your Journey...%n", userName);
                sleepy(1000);
                newJourney();
            } else {
                System.out.printf("Well, shoot. Let's try again.%n");
                characterCreation();
            }
        }
    }

    //start the journey
    public static void newJourney() {
        System.out.printf("%n---------------------%nHere begins the new journey!%n---------------------%n");
//        System.out.printf("I haven't made any more in the game...%n Please try to \"cheat\" if you haven't seen that functionality yet! %nand then, while cheating, might as well give yourself all 10's,%n and then enemy all 1's... you know. %nJust to see what would happen...");
        System.out.printf("You find yourself staring at a brightly lit computer screen, %nreading a text prompt in the guise of a role-playing game. What would you like to do?%n%n");
        String badInput = sc.next();
        System.out.printf("%n%nWell that's gibberish.%n");
        sleepy(1000);
        System.out.printf("\"%s.\"", badInput);
        sleepy(1000);

        System.out.printf("%n Means nothing to me.");
        sleepy(1000);

        System.out.printf("%n Okay, this won't work. Let's get more specific...%n");
        journeyBegins();
    }

    public static void journeyBegins() {
        System.out.printf("Have you ever battled an angry TurtleBear?%n");
        String userResponse = sc.next();
        if (userResponse.equalsIgnoreCase("yes")) {
            System.out.printf("%nWell then you're in luck!%n");
            sleepy(1000);
            System.out.printf("%nToday will be drastically different!%n");
            sleepy(1000);
            System.out.printf("%nToday you will fight the amorphous,%n");
            amorphous();
            theFight();
        } else if (userResponse.equalsIgnoreCase("no")) {
            System.out.printf("%nWell then you're in luck!%n");
            sleepy(1000);
            System.out.printf("%nToday will be no different!%n");
            sleepy(1000);
            System.out.printf("%nToday you will fight the amorphous,%n");
            amorphous();
            theFight();
        } else {
            System.out.printf("%nOh, you think you're so clever, don't you?%n");
            sleepy(1000);
            System.out.printf("%n You think you can break the rules and get away with it? %n%n");
            sleepy(2000);
            System.out.printf("Well, now you're going to have to fight TWO Turtle Bears!%n How do you feel about that?%n%n");
            sleepy(2000);
            System.out.printf("Wait... What?%n%n");
            sleepy(1000);
            System.out.printf("Oh...%n%n");
            sleepy(1000);
            System.out.printf("They're telling me that we don't have any Turtle Bears for you to fight.%n");
            sleepy(2000);
            System.out.printf("%nSpeaking of which...%n%n");
            journeyBegins();
        }
    }
        static Random rando = new Random();
        static int rando_int = rando.nextInt(9);
        static int rando_intTwo = rando.nextInt(9);
        static int randoStrength = rando.nextInt(9);
        static int randoHealth = rando.nextInt(9);
        static int randoSpeed = rando.nextInt(9);

        static String[] firstName = new String[]{"Tilfor","Onslow","Patton","Northcliffe","James", "Rider", "Goldgaze", "Silverpelt", "JW", "Jacob"};
        static String[] lastName = new String[]{"Steamwraith", "Embersnare", "Dreamscream", "Vapor", "Franco", "Duskbluff", "Goreflare", "Dawntoe", "Barrow", "Hester"};
        static String newEnemyName = firstName[rando_int] + " " + lastName[rando_intTwo];
        static int[] stats = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        static int newEnemyStrength = stats[randoStrength];
        static int newEnemySpeed = stats[randoSpeed];
        static int newEnemyHealth = stats[randoHealth];




    public static void amorphous() {
        sleepy(1500);
        System.out.printf("nuclear-powered,%n");
        sleepy(1500);
        System.out.printf("maximum-kill-boss captain%n");
        sleepy(1500);
        System.out.printf("of the slime-death army: %s!!%n%n", newEnemyName);
        sleepy(3000);
        System.out.printf("%n====================%n%s's Stats:%n---------------------%nStrength: %s%nSpeed: %s%nHP: %s%n============%n",newEnemyName, newEnemyStrength, newEnemySpeed, newEnemyHealth);
        sleepy(4000);
        System.out.printf("Prepare yourself...%n");
    }

    public static void theFight() {
        System.out.printf("Coming soon... The actual fighting!!!");
    }
    public static void main(String[] args) {
        settingUp();
    }
}


//NOTAS

//MAKE SURE YOU ADD THE ENEMY NAME WHEN NOT CHEATING
    //CREATE ENEMY NAME AND STATS BASED ON RNG'S
// ACTUALLY DO THE FIGHTING
// FIX TIMING AND SPACING
// CARRY ON