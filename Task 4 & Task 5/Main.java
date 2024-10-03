import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<String> actions = new ArrayList<String>();
		
        actions.add("1) Start game"); //adds actions to the newly created actions ArrayList
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");
		
        GameMenu gameMenu = new GameMenu(actions);
        String userChoice = gameMenu.getAction();
		
        if (userChoice.length() == 1 && userChoice.charAt(0) >= '1' && userChoice.charAt(0) <= '4'){ //makes sure that the input is only 1 digit and is between 1 and 4.
            int action = Integer.parseInt(userChoice);
            doAction(action);
			
        }

		else{
            System.out.println("Invalid input. Please enter a number between 1 and 4");
        }
    }
    public static void doAction(int action){ //this function is a switch statement which prints something based on user input (which has been verified to be a number in the code above
        switch (action){
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Invalid action. Please select a valid option from the menu");
                break;
        }
    }
}
