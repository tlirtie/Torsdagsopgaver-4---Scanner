import java.util.*;

public class GameMenu{
    private ArrayList<String> actions;
	
    public GameMenu(ArrayList<String> actions){ //constructor
        this.actions = actions;
    }
    public void displayMenu(){
        System.out.println("Game Menu Options:");
        for (String action : actions){
            System.out.println(action); //displays the added options by using a for each loop.
        }
    }
    public String getAction(){
        System.out.println("Type a number to choose an action:");
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        return choice; //returns whatever the user inputs
    }
}
