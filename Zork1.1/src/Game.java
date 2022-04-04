
import java.util.Locale;
import java.util.*;
public class Game {

    public void playerSetUp(){

        int playerHealth ;
        playerHealth = 100 ;
        String playerWeapon;
        playerWeapon = "Knife";
        System.out.println("Welcome to Character Creation");
        System.out.println("Your HP: " + playerHealth);
        System.out.println("Your Weapon: " + playerWeapon);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String answer;
        Game game;
        game = new Game();
        game.playerSetUp();
        game.house();


    }

    public static void house(){
        boolean key = false;
        boolean locked = true;
        boolean next = true;
        Scanner input = new Scanner(System.in);
        String answer;
        System.out.println("You are in a very old house");
        System.out.println("The smell is really bad in here!");
        System.out.println("Find a way to get out");
        while(next){
            answer = input.nextLine();
            if(answer.toLowerCase()=="go west") {
                System.out.println("You are in front of a window");
                System.out.println("You look outside and its raining");
                System.out.println("The sound of thunder gaze the land");
            }
            else if (answer.toLowerCase()=="go south") {
                System.out.println("Its just a wall.Nothing to see here!");
            }
            else if (answer.toLowerCase()=="go east"){
                System.out.println("The is a drawer in front of you.");
                System.out.println("The is a photo of a family with 3 kids");
                System.out.println("Also there is a golden key");
                answer = input.nextLine();
                if (answer == "take key") {
                    System.out.println("You put the key in you pocked");
                    System.out.println("It may usefull for later.");
                    key = false;
                }
            }
            else if (answer.toLowerCase()=="go north"){
                answer = input.nextLine();
                if (answer.toLowerCase()=="open door"){
                    if(!locked) {
                        System.out.println("The door is open");
                        System.out.println("You are going now to the central park of the town");
                    }
                    else if(locked){
                        System.out.println("You cant open the door");
                        System.out.println("The door is locked!");
                        System.out.println("You need a key to open the door");
                        answer = input.nextLine();
                        if (answer=="use key"){
                            if (key) {
                                System.out.println("The door is now unlocked");
                                locked = false;
                                next = false;
                            }
                            else if (!key){
                                System.out.println("You need a key to unlock the door");
                            }
                            else{
                                System.out.println("You can't do that");
                            }
                        }
                        else{
                            System.out.println("You cant do that");
                        }
                    }
                    else{
                        System.out.println("You cant do that");
                    }

                }

        }

        }


    }

}
