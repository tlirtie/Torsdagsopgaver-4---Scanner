import java.util.*;

class Main{
	
	public static void main(String[] args){
		Team team1 = new Team("Avarta");
		team1.setRank(3);
		
		Team team2 = new Team("Holdet 2");
		Team team3 = new Team("Det tredje hold");
		Team team4 = new Team("Holdnummerfire");
		Team team5 = new Team("Teamnumberfive");
		Team team6 = new Team("H6");
		
		team2.setRank(2);
		team3.setRank(4);
		team4.setRank(1);
		team5.setRank(6);
		team6.setRank(5);
		
		team1.addPlayer("Henrik");
		team1.addPlayer("Bent");
		
		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());
		System.out.println(team6.toString());
		

		

		
		
		
	}


}