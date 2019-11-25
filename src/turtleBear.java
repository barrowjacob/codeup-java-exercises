import java.util.Scanner;
import java.util.Random;

public class turtleBear {
    static String userName;
    static String enemyName;
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    static int i = 0;
    public static void sleepy(int num) {
        try {
            Thread.sleep(num);
        } catch (Exception e) {
            System.out.println("yep");
        }
    }

    //set everything up
    public static void settingUp() {
        System.out.printf("Greetings individual! %n");
        sleepy(1000);
        System.out.printf("Are you prepared to fight in%nEXTREME");
        sleepy(1000);
        System.out.printf("%nONE ON ONE%n");
        sleepy(1000);
        System.out.printf("MAXIMUM%n");
        sleepy(1000);
        System.out.printf("EXTREME COMBAT?%n");
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("yep")) {
            System.out.println("Great! Let's do this!");
        } else {
            System.out.printf("Whatever! Let's do this! %n");
        }
        System.out.printf("What is your name?%n");
        userName = sc.next();
        System.out.printf("%s, eh?", userName);
        sleepy(1500);
        System.out.printf("%nSounds like the name of a winner!%n Now tell me, %s.", userName);
        sleepy(2000);

        do {
            System.out.printf("%nDo you want to cheat and make your own enemy or play fairly and just let us do the talking? %nType \"CHEAT\" or \"PLAY FAIR\"%n");
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
        System.out.println("Please tell me your of your might. Strength: (1-10)\n");
        byte userStrength = sc.nextByte();
        System.out.printf("And how tough are you? Guard: (1-10)%n");
        byte userGuard = sc.nextByte();
        System.out.printf("What of your vitality? HP: (1-10)%n");
        byte userHealth = sc.nextByte();
        if (userStrength == 10 && userGuard == 10 && userHealth == 10) {
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
        System.out.printf("And what of their toughness? Guard: (1-10)%n");
        byte enemyGuard = sc.nextByte();
        System.out.printf("Is their health even comparable to yours? HP: (1-10)%n");
        byte enemyHealth = sc.nextByte();
        if (enemyStrength == 1 && enemyGuard == 1 && enemyHealth == 1) {
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

            System.out.println("Okay! Well, there we go.");
            sleepy(1000);
            System.out.printf("%nTwo mighty warriors preparing to face battle.");
            sleepy(1000);
            System.out.printf("%nLet's make sure I heard you correctly: %n%n");
            sleepy(2000);

            System.out.printf("--------------  %n %s's Stats: %n -----------%n Strength: %s %n Guard: %s %n HP: %s %n ==============%n", userName, userStrength, userGuard, userHealth);
            sleepy(5000);
            System.out.printf("%s's Stats: %n -------------- %n Strength: %s %n Guard %s %n HP %s %n -----------%n%nIs this all correct?%n", enemyName, enemyStrength, enemyGuard, enemyHealth);
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
        sleepy(1500);
        System.out.printf("\"%s.\"", badInput);
        sleepy(1000);
        System.out.printf("%n Means nothing to me.");
        sleepy(1500);
        System.out.printf("%n Okay, this won't work. Let's get more specific...%n");
        journeyBegins();
    }

    public static void journeyBegins() {
        System.out.printf("Have you ever battled an angry TurtleBear?%n");
        String userResponse = sc.next();
        if (userResponse.equalsIgnoreCase("yes")) {
            System.out.printf("%nWell then you're in luck!%n");
            sleepy(1500);
            System.out.printf("%nToday will be drastically different!%n");
            sleepy(1500);
            System.out.printf("%nToday you will fight the amorphous,%n");
            amorphous();
            theFight();
        } else if (userResponse.equalsIgnoreCase("no")) {
            System.out.printf("%nWell then you're in luck!%n");
            sleepy(1500);
            System.out.printf("%nToday will be no different!%n");
            sleepy(1500);
            System.out.printf("%nToday you will fight the amorphous,%n");
            amorphous();
            theFight();
        } else if (i > 0) {
            System.out.println("You think you're clever, don't you?");
            sleepy(1500);
            System.out.printf("%n You think you can break the rules and get away with it? %n%n");
            sleepy(2000);
            System.out.printf("Well, now you're going to have to fight TWO Turtle Bears!%n How do you feel about that?%n%n");
            sleepy(2000);
            System.out.printf("Wait... %n%n");
            sleepy(1500);
            System.out.printf("Oh...%n%n");
            sleepy(1500);
            System.out.printf("They're telling me that we don't have any Turtle Bears for you to fight.%n");
            sleepy(2000);
            System.out.printf("%nSpeaking of which...%n%n");
            journeyBegins();
        } else {
            System.out.printf("%n Type \"YES\" or \"NO\", please.");
            i++;
            journeyBegins();

        }
    }
    //RANDOM NUMBER GENERATORS
        static Random rando = new Random();
        static int rando_int = rando.nextInt(9);
        static int rando_intTwo = rando.nextInt(9);
        static int randoStrength = rando.nextInt(9);
        static int randoHealth = rando.nextInt(9);
        static int randoGuard = rando.nextInt(9);
        static int userStrength = rando.nextInt(9);
        static int userHealth = rando.nextInt(9);
        static int userGuard = rando.nextInt(9);
        static int enemyChoice = rando.nextInt(1);

        //GENERATOR ARRAYS
        static String[] firstName = new String[]{"Tilfor","Onslow","Patton","Northcliffe","James", "Rider", "Goldgaze", "Silverpelt", "JW", "Jacob"};
        static String[] lastName = new String[]{"Steamwraith", "Embersnare", "Dreamscream", "Vapor", "Franco", "Duskbluff", "Goreflare", "Dawntoe", "Barrow", "Hester"};
        static String newEnemyName = firstName[rando_int] + " " + lastName[rando_intTwo];
        static int[] stats = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        static int[] userStats = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        static String[] enemyChoices = new String[]{"ATTACK", "GUARD"};

        //SETTING THE VARIABLES
        static int newEnemyStrength = stats[randoStrength];
        static int newEnemyGuard = stats[randoGuard];
        static int newEnemyHealth = stats[randoHealth];
        static int newUserStrength = userStats[userStrength];
        static int newUserGuard = userStats[userGuard];
        static int newUserHealth = userStats[userHealth];




    public static void amorphous() {
        sleepy(1500);
        System.out.printf("nuclear-powered,%n");
        sleepy(1500);
        System.out.printf("maximum-kill-boss %n");
        sleepy(1500);
        System.out.printf("captain of the slime-death army: %s!!%n%n", newEnemyName);
        sleepy(3000);
        System.out.printf("%n====================%n%s's Stats:%n---------------------%nStrength: %d%nGuard: %d%nHP: %d%n============%n",newEnemyName, newEnemyStrength, newEnemyGuard, newEnemyHealth);
        sleepy(4000);
        System.out.printf("Prepare yourself...%n");
        sleepy(2000);
    }

    public static void theFight() {
        System.out.printf("=========================================%nTIME TO FIGHT%n=========================================%n");
        while(true) {
        System.out.printf("| CHOOSE YOUR MOVE |           YOUR STATS |%n| ATTACK |           YOUR STRENGTH: %d |%n| DEFEND |           YOUR GUARD: %d |%n| FLEE |           YOUR HP: %d |%n", newUserStrength, newUserGuard, newUserHealth);
        System.out.printf("===========================================%n");
        String userMove = sc.next();

            //your turn
                if (userMove.equalsIgnoreCase("attack")) {
                    if (newEnemyGuard >= newUserStrength) {
                        newEnemyHealth--;
                    } else {
                        newEnemyHealth -= (newUserStrength);
                    }
                    System.out.printf("You attacked for %d hit points! %s's health is now  %d%n", newUserStrength, newEnemyName, newEnemyHealth);
                    if (newEnemyHealth < 1) {
                        winCredits();
                    }
                } else if (userMove.equalsIgnoreCase("guard")) {
                    newUserGuard += 10;
                } else if (userMove.equalsIgnoreCase("flee")) {
                    System.out.println("You can't escape.");
                } else {
                    System.out.println("You stand around, sipping tea and thinking about Yu-Gi-Oh, rather than do anything productive with your life. YOU FORFEIT YOUR TURN.");
                }



            //enemy turn

            System.out.printf("%s's turn!%n", newEnemyName);
            System.out.printf("He's going to " + enemyChoices[enemyChoice] + "%n");
            if (enemyChoices[enemyChoice].equalsIgnoreCase("attack")) {
                if (newUserGuard >= newEnemyStrength) {
                    newUserHealth--;
                    System.out.printf("He attacked for %d and your health is now %d%n", newEnemyStrength, newUserHealth);
                } else {
                    newUserHealth -= newEnemyStrength;
                    System.out.printf("He attacked for %d and your health is now %d%n", newEnemyStrength, newUserHealth);
                } if (newUserHealth < 0) {
                    loseCredits();
                    return;
                }
            } else if (enemyChoices[enemyChoice].equalsIgnoreCase("defend")) {
                newEnemyGuard++;
            }
        }
    }
    public static void winCredits() {
        System.out.printf("Great job! You won!%n%n-----------%nGAME OVER!%n-----------%n");
    }

    public static void loseCredits() {
        System.out.printf("Ouch. You dead. :( %n%n-----------%nGAME OVER!%n-----------%n");
    }
    public static void main(String[] args) {
        settingUp();
    }

}


//NOTAS
// FIX FIGHT ON "CHEAT" MODE TO REFLECT INPUTTED STATS
// FIX TIMING AND SPACING
// CARRY ON