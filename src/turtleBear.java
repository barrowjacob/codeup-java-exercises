import java.util.Scanner;
import java.util.Random;

public class turtleBear {
    static String userName;
    static String firstName;
    static String enemyName1;
    static int enemyStrength1 = 0;
    static int enemyHealth1 = 0;
    static int enemyGuard1 = 0;
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    static int i = 0;
    static int j = 0;
    public static void sleepy1(int num) {
        try {
            Thread.sleep(num);
        } catch (Exception e) {
            System.out.println("yep");
        }
    }

    //*********************//
    // BEGIN SETTING IT UP //
    //*********************//

    public static void settingUp() {
        System.out.printf("%n%nGreetings human!! %n");
        sleepy1(1000);
        System.out.printf("Welcome to...%n%n");
        sleepy1(1500);

        System.out.println("  ____  _                   __   _____ _          \n" +
                " |  _ \\(_)___  ___    ___  / _| |_   _| |__   ___ \n" +
                " | |_) | / __|/ _ \\  / _ \\| |_    | | | '_ \\ / _ \\\n" +
                " |  _ <| \\__ \\  __/ | (_) |  _|   | | | | | |  __/\n" +
                " |_| \\_\\_|___/\\___|  \\___/|_|     |_| |_| |_|\\___|\n" +
                "                                                  ");
        System.out.printf(" _____ _   _______ _____ _      _____  ______ _____  ___  ______ \n" +
                "|_   _| | | | ___ \\_   _| |    |  ___| | ___ \\  ___|/ _ \\ | ___ \\\n" +
                "  | | | | | | |_/ / | | | |    | |__   | |_/ / |__ / /_\\ \\| |_/ /\n" +
                "  | | | | | |    /  | | | |    |  __|  | ___ \\  __||  _  ||    / \n" +
                "  | | | |_| | |\\ \\  | | | |____| |___  | |_/ / |___| | | || |\\ \\ \n" +
                "  \\_/  \\___/\\_| \\_| \\_/ \\_____/\\____/  \\____/\\____/\\_| |_/\\_| \\_|%n%n");

        sleepy1(4000);
        System.out.printf("This is an automated text adventure, which means that the prompts will go ahead on their own!%n%n");
        sleepy1(2000);
        System.out.printf("No need to press \"ENTER\" or anything silly like that when the narration is going on.%n%n");
        sleepy1(2000);
        System.out.printf("Feel free to press \"ENTER\" when you're done with your responses, though!%n%n");
        sleepy1(2500);
        System.out.printf("Okay... Let's get this show on the road!!%n%n");
        sleepy1(3000);
        System.out.printf("Are you prepared to fight in the%n");
        sleepy1(1500);
        System.out.printf("MOST EXTREME,%n");
        sleepy1(1000);
        System.out.printf("ONE ON ONE,%n");
        sleepy1(1000);
        System.out.printf("MAXIMUM,%n");
        sleepy1(1000);
        System.out.printf("EXTREME COMBAT?%n");
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("yep")) {
            System.out.println("Great! Let's do this!");
        } else {
            System.out.printf("Whatever! Let's do this! %n");
        }
        System.out.printf("What is your name?%n");
        userName = sc.next();
        System.out.printf("%s, eh?%n",userName);
        sleepy1(1500);
        System.out.printf("%nSounds like the epic name of a super-winner! %n");
        sleepy1(1500);
        System.out.printf("I'm sure your parents are very proud of you.%n");
        sleepy1(1500);
        System.out.printf("%nNow tell me, %s.", userName);
        sleepy1(1500);

        do {
            System.out.printf("%nDo you want to cheat and DESIGN your own enemy%n");
            sleepy1(1500);
            System.out.printf("or play fairly and just let us do the talking? %n");
            sleepy1(1500);
            System.out.printf("Type \"CHEAT\" or \"PLAY FAIR\"%n");
            String userCheat = sc.next();
            if (userCheat.equalsIgnoreCase("cheat")) {
                System.out.printf("*Sigh* Okay, %s. Have it your way.%n", userName);
                characterCreation();
                return;
            } else if (userCheat.equalsIgnoreCase("play fair")) {
                newJourney1();
                return;
            } else {
                System.out.printf("That's not an option, I'm afraid.");
            }
        } while (true);
    }


    //********************//
    // DESIGNING YOURSELF //
    //********************//

    public static void characterCreation() {
        System.out.println("Please tell me your of your might. STRENGTH: (1-10)\n");
        byte userStrength1 = sc.nextByte();
        System.out.printf("And how tough are you? DEFENSE: (1-10)%n");
        byte userGuard1 = sc.nextByte();
        System.out.printf("What of your vitality? HP: (1-10)%n");
        byte userHealth1 = sc.nextByte();
        if (userStrength1 == 10 && userGuard1 == 10 && userHealth1 == 10) {
            System.out.printf("%n...%n");
            sleepy1(1000);
            System.out.printf("Seriously %s.", userName);
            sleepy1(1000);
            System.out.printf("%nYou gave yourself all 10's?");
            sleepy1(1500);
            System.out.printf("%nWell, whatever. Let's keep going.%n%n");
        }
        ;
        sleepy1(1500);
         class Local{
            public void amorphous1 () {
                sleepy1(1500);
                System.out.printf("nuclear-powered,%n");
                sleepy1(1500);
                System.out.printf("maximum-kill-boss %n");
                sleepy1(1500);
                System.out.printf("captain of the slime-death army: %s!!%n%n", enemyName1);
                sleepy1(3000);
                System.out.printf("%n====================%n%s's Stats:%n---------------------%nStrength: %d%nDEFENSE: %d%nHP: %d%n============%n", enemyName1, enemyStrength1, enemyGuard1, enemyHealth1);
                sleepy1(4000);
                System.out.printf("%n====================%n%s's Stats:%n---------------------%nStrength: %d%nDEFENSE: %d%nHP: %d%n============%n", userName, userStrength1, userGuard1, userHealth1);
                System.out.printf("Prepare yourself...%n");
                sleepy1(2000);
            }
        }

        //*********************//
        // DESIGNING THE ENEMY //
        //*********************//

        System.out.printf("Tell me, mighty warrior: %nWhat is the name of the foe you will face in glorious combat? Name: %n");
        j++;
        enemyName1 = sc.next();
        System.out.printf("And what is %s's strength? STRENGTH: (1-10)%n", enemyName1);
        byte enemyStrength1 = sc.nextByte();
        System.out.printf("And what of their toughness? GUARD: (1-10)%n");
        byte enemyGuard1 = sc.nextByte();
        System.out.printf("Is their health even comparable to yours? HP: (1-10)%n");
        byte enemyHealth1 = sc.nextByte();
        if (enemyStrength1 == 1 && enemyGuard1 == 1 && enemyHealth1 == 1) {
            sleepy1(1000);
            System.out.printf("......%n%n");
            sleepy1(1500);
            System.out.printf("You really aren't going to make this game very fun if you keep cheating like this.%n%n");
            sleepy1(3000);
            if (j > 0) {

                //******************//
                // CONFIRMING STATS //
                //******************//

                System.out.println("Okay! Well, there we go.");
                sleepy1(1000);
                System.out.printf("%nTwo mighty warriors preparing to face battle.");
                sleepy1(1000);
                System.out.printf("%nLet's make sure I heard you correctly: %n%n");
                sleepy1(2000);
                System.out.printf("--------------  %n %s's Stats: %n -----------%n Strength: %s %n Guard: %s %n HP: %s %n ==============%n", userName, userStrength1, userGuard1, userHealth1);
                sleepy1(5000);
                System.out.printf("%s's Stats: %n -------------- %n Strength: %s %n Guard %s %n HP %s %n -----------%n%nIs this all correct?%n", enemyName1, enemyStrength1, enemyGuard1, enemyHealth1);
                String userConfirm = sc.next();
                if (userConfirm.equalsIgnoreCase("yes")) {
                    sleepy1(1000);
                    System.out.printf("%n%nAt last! %s, it is time to begin your Journey...%n", userName);
                    sleepy1(1000);
                    newJourney1();
                } else {
                    System.out.printf("Well, shoot. Let's try again.%n");
                    characterCreation();
                }

                //***************//
                //  PRE-JOURNEY  //
                //***************//
                class SecondLocal {
                    public static void newJourney1() {
                        System.out.printf("%n==========================%nTHE JOURNEY%n==========================%n");
                        System.out.printf("You find yourself staring at a brightly lit computer screen, %nreading a text prompt in the guise of a role-playing game. What would you like to do?%n%n");
                        String badInput = sc.next();
                        System.out.printf("%n%nWell that's gibberish.%n");
                        sleepy1(1500);
                        System.out.printf("\"%s.\"", badInput);
                        sleepy1(1000);
                        System.out.printf("%n Means nothing to me.");
                        sleepy1(1500);
                        System.out.printf("%n Okay, this won't work. Let's get more specific...%n");
                        journeyBegins1();
                    }


                    //****************//
                    // JOURNEY BEGINS //
                    //****************//


                    public void journeyBegins1() {
                        System.out.printf("Have you ever battled an angry TurtleBear?%n");
                        String userResponse1 = sc.next();
                        if (userResponse1.equalsIgnoreCase("yes")) {
                            System.out.printf("%nWell then you're in luck!%n");
                            sleepy1(1500);
                            System.out.printf("%nToday will be drastically different!%n");
                            sleepy1(1500);
                            System.out.printf("%nToday you will fight the amorphous,%n");
                            amorphous1();
                            theFight1();
                        } else if (userResponse1.equalsIgnoreCase("no")) {
                            System.out.printf("%nWell then you're in luck!%n");
                            sleepy1(1500);
                            System.out.printf("%nToday will be no different!%n");
                            sleepy1(1500);
                            System.out.printf("%nToday you will fight the amorphous,%n");
                            amorphous1();
                            theFight1();
                        } else if (i > 0) {
                            System.out.println("You think you're clever, don't you?");
                            sleepy1(1500);
                            System.out.printf("%nYou think you can just go around breaking the rules and get away with it? %n%n");
                            sleepy1(2000);
                            System.out.printf("Well, now you're going to have to fight TWO Turtle Bears!");
                            sleepy1(3000);
                            System.out.printf("%n How do you feel about that?%n%n");
                            sleepy1(2000);
                            System.out.printf("Wait... %n%n");
                            sleepy1(1500);
                            System.out.printf("Oh...%n%n");
                            sleepy1(1500);
                            System.out.printf("They're telling me that we don't have any Turtle Bears for you to fight.%n");
                            sleepy1(2000);
                            System.out.printf("%nSpeaking of which...%n%n");
                            journeyBegins1();
                        } else {
                            System.out.printf("%n Type \"YES\" or \"NO\", please.%n");
                            i++;
                            journeyBegins1();

                        }
                    }

                    //*****************//
                    // BEGIN THE FIGHT //
                    //*****************//

                    public void theFight1() {
                        System.out.printf("=========================================%nTIME TO FIGHT%n=========================================%n");
                        while (true) {
                            System.out.printf("%n%n===========================================%n%n| CHOOSE YOUR MOVE |           YOUR STATS |%n------------------------------------------- %n| ATTACK |               YOUR STRENGTH: %d |%n| DEFEND |                  YOUR DEFENSE: %d |%n| FLEE |                       YOUR HP: %d |%n", newUserStrength, newUserGuard, newUserHealth);
                            System.out.printf("===========================================%n");
                            sleepy1(3000);
                            String userMove = sc.next();

                            //***********//
                            // YOUR TURN //
                            //***********//
                            userBonusDefense = 0;
                            if (userMove.equalsIgnoreCase("attack")) {
                                if (newEnemyGuard + enemyBonusDefense >= newUserStrength) {
                                    newEnemyHealth--;
                                    sleepy1(2000);
                                    System.out.printf("You attacked for %d hit points! %s's health is now  %d%n", newUserStrength, newEnemyName, newEnemyHealth);
                                    sleepy1(1000);
                                    if (newEnemyHealth < 1) {
                                        winCredits();
                                        return;
                                    }
                                } else {
                                    newEnemyHealth -= (newUserStrength);
                                    sleepy1(2000);
                                    System.out.printf("You attacked for %d hit points! %s's health is now  %d%n", newUserStrength, newEnemyName, newEnemyHealth);
                                    sleepy1(1000);
                                    if (newEnemyHealth < 1) {
                                        winCredits();
                                        return;
                                    }
                                }

                            } else if (userMove.equalsIgnoreCase("defend")) {
                                userBonusDefense += 10;
                                System.out.printf("Your defense is now SUPERCHARGED!%n");
                                sleepy1(2000);
                            } else if (userMove.equalsIgnoreCase("flee")) {
                                System.out.println("You can't escape.");
                                sleepy1(2000);
                            } else {
                                System.out.println("You stand around, sipping tea and thinking about Yu-Gi-Oh, rather than do anything productive with your life. YOU FORFEIT YOUR TURN.");
                                sleepy1(4000);
                            }

                            //************//
                            // ENEMY TURN //
                            //************//

                            System.out.printf("%n%n========================%n%s's turn!%n========================%n%n", newEnemyName);
                            System.out.printf("He's going to " + enemyChoices[enemyChoice] + "%n");
                            sleepy1(2000);
                            if (enemyChoices[enemyChoice].equalsIgnoreCase("attack")) {
                                if (newUserGuard + userBonusDefense >= newEnemyStrength) {
                                    newUserHealth--;
                                    System.out.printf("He attacked for %d and your health is now %d%n", newEnemyStrength, newUserHealth);
                                    sleepy1(3000);
                                    if (newUserHealth < 1) {
                                        loseCredits();
                                        return;
                                    }
                                } else {
                                    newUserHealth -= newEnemyStrength;
                                    System.out.printf("He attacked for %d and your health is now %d%n", newEnemyStrength, newUserHealth);
                                    sleepy1(3000);
                                    if (newUserHealth < 1) {
                                        loseCredits();
                                        return;
                                    }
                                }
                            } else if (enemyChoices[enemyChoice].equalsIgnoreCase("defend")) {
                                enemyBonusDefense += 10;
                                sleepy1(2000);
                            }
                        }
                    }
                }

            }


//==========================================================================================================
//==========================================================================================================

            else {
                //***************//
                //  PRE-JOURNEY  //
                //***************//
                class Local {
                    public static void newJourney() {
                        System.out.printf("%n==========================%nTHE JOURNEY%n==========================%n");
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

                    //****************//
                    // JOURNEY BEGINS //
                    //****************//

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
                            System.out.printf("%nYou think you can just go around breaking the rules and get away with it? %n%n");
                            sleepy(2000);
                            System.out.printf("Well, now you're going to have to fight TWO Turtle Bears!");
                            sleepy(3000);
                            System.out.printf("%n How do you feel about that?%n%n");
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
                            System.out.printf("%n Type \"YES\" or \"NO\", please.%n");
                            i++;
                            journeyBegins();

                        }
                    }


                    //*****************//
                    // BEGIN THE FIGHT //
                    //*****************//

                    public static void theFight() {
                        System.out.printf("=========================================%nTIME TO FIGHT%n=========================================%n");
                        while (true) {
                            System.out.printf("%n%n===========================================%n%n| CHOOSE YOUR MOVE |           YOUR STATS |%n------------------------------------------- %n| ATTACK |               YOUR STRENGTH: %d |%n| DEFEND |                  YOUR DEFENSE: %d |%n| FLEE |                       YOUR HP: %d |%n", newUserStrength, newUserGuard, newUserHealth);
                            System.out.printf("===========================================%n");
                            sleepy(3000);
                            String userMove = sc.next();

                            //***********//
                            // YOUR TURN //
                            //***********//
                            userBonusDefense = 0;
                            if (userMove.equalsIgnoreCase("attack")) {
                                if (newEnemyGuard + enemyBonusDefense >= newUserStrength) {
                                    newEnemyHealth--;
                                    sleepy(2000);
                                    System.out.printf("You attacked for %d hit points! %s's health is now  %d%n", newUserStrength, newEnemyName, newEnemyHealth);
                                    sleepy(1000);
                                    if (newEnemyHealth < 1) {
                                        winCredits();
                                        return;
                                    }
                                } else {
                                    newEnemyHealth -= (newUserStrength);
                                    sleepy(2000);
                                    System.out.printf("You attacked for %d hit points! %s's health is now  %d%n", newUserStrength, newEnemyName, newEnemyHealth);
                                    sleepy(1000);
                                    if (newEnemyHealth < 1) {
                                        winCredits();
                                        return;
                                    }
                                }

                            } else if (userMove.equalsIgnoreCase("defend")) {
                                userBonusDefense += 10;
                                System.out.printf("Your defense is now SUPERCHARGED!%n");
                                sleepy(2000);
                            } else if (userMove.equalsIgnoreCase("flee")) {
                                System.out.println("You can't escape.");
                                sleepy(2000);
                            } else {
                                System.out.println("You stand around, sipping tea and thinking about Yu-Gi-Oh, rather than do anything productive with your life. YOU FORFEIT YOUR TURN.");
                                sleepy(4000);
                            }

                            //************//
                            // ENEMY TURN //
                            //************//

                            System.out.printf("%n%n========================%n%s's turn!%n========================%n%n", newEnemyName);
                            System.out.printf("He's going to " + enemyChoices[enemyChoice] + "%n");
                            sleepy(2000);
                            if (enemyChoices[enemyChoice].equalsIgnoreCase("attack")) {
                                if (newUserGuard + userBonusDefense >= newEnemyStrength) {
                                    newUserHealth--;
                                    System.out.printf("He attacked for %d and your health is now %d%n", newEnemyStrength, newUserHealth);
                                    sleepy(3000);
                                    if (newUserHealth < 1) {
                                        loseCredits();
                                        return;
                                    }
                                } else {
                                    newUserHealth -= newEnemyStrength;
                                    System.out.printf("He attacked for %d and your health is now %d%n", newEnemyStrength, newUserHealth);
                                    sleepy(3000);
                                    if (newUserHealth < 1) {
                                        loseCredits();
                                        return;
                                    }
                                }
                            } else if (enemyChoices[enemyChoice].equalsIgnoreCase("defend")) {
                                enemyBonusDefense += 10;
                                sleepy(2000);
                            }
                        }
                    }

                    //****************************//
                    // RANDOM VARIABLE GENERATORS //
                    //****************************//

                    static Random rando = new Random();
                    static int rando_int = rando.nextInt(9);
                    static int rando_intTwo = rando.nextInt(9);
                    static int newEnemyStrength = rando.nextInt(10) + 1;
                    static int newEnemyHealth = rando.nextInt(10) + 1;
                    static int newEnemyGuard = rando.nextInt(10) + 1;
                    static int newUserStrength = rando.nextInt(10) + 1;
                    static int newUserHealth = rando.nextInt(10) + 1;
                    static int newUserGuard = rando.nextInt(10) + 1;
                    static int enemyChoice = rando.nextInt(1);
                    static int userBonusDefense = 0;
                    static int enemyBonusDefense = 0;

                    //******************//
                    // GENERATOR ARRAYS //
                    //******************//

                    static String[] firstEvilName = new String[]{"Tilfor", "Onslow", "Patton", "Northcliffe", "James", "Rider", "Goldgaze", "Silverpelt", "JW", "Jacob"};
                    static String[] lastEvilName = new String[]{"Steamwraith", "Embersnare", "Dreamscream", "Vapor", "Franco", "Duskbluff", "Goreflare", "Dawntoe", "Barrow", "Hester"};
                    static String newEnemyName = firstEvilName[rando_int] + " " + lastEvilName[rando_intTwo];
                    static String[] enemyChoices = new String[]{"ATTACK", "DEFENSE"};

                    //**********************//
                    // DESCRIPTION OF ENEMY //
                    //**********************//

                    public static void amorphous() {
                        sleepy(1500);
                        System.out.printf("nuclear-powered,%n");
                        sleepy(1500);
                        System.out.printf("maximum-kill-boss %n");
                        sleepy(1500);
                        System.out.printf("captain of the slime-death army: %s!!%n%n", newEnemyName);
                        sleepy(3000);
                        System.out.printf("%n====================%n%s's Stats:%n---------------------%nStrength: %d%nDEFENSE: %d%nHP: %d%n============%n", newEnemyName, newEnemyStrength, newEnemyGuard, newEnemyHealth);
                        sleepy(4000);
                        System.out.printf("%n====================%n%s's Stats:%n---------------------%nStrength: %d%nDEFENSE: %d%nHP: %d%n============%n", userName, newUserStrength, newUserGuard, newUserHealth);
                        System.out.printf("Prepare yourself...%n");
                        sleepy(2000);
                    }

                    //***************//
                    // CONSOLE DELAY //
                    //***************//

                    public static void sleepy(int num) {
                        try {
                            Thread.sleep(num);
                        } catch (Exception e) {
                            System.out.println("yep");
                        }
                    }
                }
            }
        }
    }


    //*****************//
    // CLOSING METHODS //
    //*****************//

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
// THE FIGHT DOESN'T ALWAYS END IF YOU WIN!!
// FIX TIMING AND SPACING
// CARRY ON