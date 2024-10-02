import java.util.*;

class Team{
	
	private String teamName;
	private int teamRank;
	private ArrayList<String> playerNames;
	
	public Team(String teamName){ 
		this.teamName = teamName;
		this.teamRank = teamRank;
		this.playerNames = new ArrayList<String>();
	}
	
	public void setRank(int teamRank){
		this.teamRank = teamRank;
		
		
		
	}
	
    @Override
    public String toString(){

        String result = "Hold: " + teamName + " Rang: " + teamRank + "\nSpillere:\n";
        
        for (int i = 0; i < playerNames.size(); i++){
            result += playerNames.get(i) + "\n";  
        }
        
        return result;  
    }
	
	public void addPlayer(String name){
		this.playerNames.add(name);
		
		
		
	}


}