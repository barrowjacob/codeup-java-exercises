import java.util.Scanner;
import java.util.Random;

public class turtleBear {
    static String userName;
    static String enemyName;
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    //set everything up
    public static void settingUp() {
        System.out.printf("Greetings individual! What is your name?%n");
        userName = sc.next();
        System.out.printf("%s, eh? Excellent. %nNow tell me, %s. %nDo you want to cheat and make your own enemy stats %nor play fairly and just let us do the talking? %nType \"CHEAT\" or \"PLAY FAIR\"%n", userName, userName);
        String userCheat = sc.next();
        if (userCheat.equalsIgnoreCase("cheat")) {
            System.out.printf("*Sigh* Okay, %s. Have it your way.%n", userName);
            characterCreation();
        } else {
            newJourney();
        }
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
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("yep");
                    }
                    System.out.printf("Seriously %s.",userName);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("yep");
                    }
                    System.out.printf("%nYou gave yourself all 10's?");
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {
                        System.out.println("yep");
                    }
                    System.out.printf("%nWell, whatever. Let's keep going.%n%n");
                };
            try {
                 Thread.sleep(1500);
            } catch (Exception e) {
                 System.out.println("yep");
            }
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
                    System.out.printf("......");
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {
                        System.out.println("yep");
                    }
                    System.out.printf("You really aren't going to make this game very fun if you keep cheating like this.%n%n");
                try {
                    Thread.sleep(3000);
                }
                catch(Exception e) {
                    System.out.print("this is a catch block");
                    }
                }
                System.out.printf("Okay! Well, there we go. %nTwo mighty warriors preparing to face battle. %nLet's make sure I heard you correctly: %n%n");
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    System.out.println("yep");
                }
         System.out.printf("--------------  %n %s's Stats: %n -----------%n Strength: %s %n Speed: %s %n HP: %s %n ==============%n",userName, userStrength, userSpeed, userHealth);
         try {
             Thread.sleep(5000);
         } catch (Exception e) {
             System.out.println("yep");
         }
         System.out.printf("%s's Stats: %n -------------- %n Strength: %s %n Speed %s %n HP %s %n -----------%n%nIs this all correct?%n",enemyName, enemyStrength, enemySpeed, enemyHealth);
                String userConfirm = sc.next();
                if (userConfirm.equalsIgnoreCase("yes")) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("yep");
                    }
                    System.out.printf("%n%nAt last! %s, it is time to begin your Journey...%n", userName);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("yep");
                    }
                    newJourney();
                } else {
                    System.out.printf("Well, shoot. Let's try again.%n");
                    characterCreation();
                }
            }


    private static void sleep(int num) {
    }

    //start the journey
    public static void newJourney() {
        System.out.printf("%n---------------------%nHere begins the new journey!%n---------------------%n");
//        System.out.printf("I haven't made any more in the game...%n Please try to \"cheat\" if you haven't seen that functionality yet! %nand then, while cheating, might as well give yourself all 10's,%n and then enemy all 1's... you know. %nJust to see what would happen...");
        System.out.printf("You find yourself staring at a brightly lit computer screen, reading a text prompt in the guise of a role-playing game. What would you like to do?");
        String badInput = sc.next();
        System.out.printf("Well that's gibberish. %s means nothing to me right now.%n Okay, this won't work. Let's get more specific...", badInput);
        journeyBegins();
    }
    public static void journeyBegins() {
        System.out.print("Have you ever battled an angry TurtleBear?");
        String userResponse = sc.next();
            if (userResponse.equalsIgnoreCase("yes")) {
                System.out.printf("Well then you're in luck! Today will be drastically different! %nToday you will fight the amorphous, nuclear-powered, maximum-kill-boss captain of the slime-death army: %s.", enemyName);
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("yep");
                }
                System.out.printf("Watch out! He's way strong. Unlike the Turtle Bear. Which would have been super great for you to fight. Oh well!");
            } else if (userResponse.equalsIgnoreCase("no")) {
                System.out.printf("Well then you're in luck! Today will be no different!%nToday you will fight the amorphous, nuclear-powered, maximum-kill-boss captain of the slime-death army: %s.", enemyName);
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("yep");
                }
                System.out.printf("Watch out! He's way strong. Unlike the Turtle Bear. Which would have been super great for you to fight. Oh well!");
            } else {
                System.out.printf("Oh, you think you're clever, don't you? %n You think you can break the rules and get away with it? %n");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    System.out.println("yep");
                }
                System.out.printf("Well, now you're going to have to fight TWO Turtle Bears! How do you feel about that?");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("yep");
                }
                System.out.printf("Wait... What?");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("yep");
                }
                System.out.printf("Oh...");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("yep");
                }
                System.out.printf("Turns out we don't have any Turtle Bears for you to fight. Speaking of which...");
                journeyBegins();
            }
    }


    public static void main(String[] args) {
        settingUp();
    }
}
