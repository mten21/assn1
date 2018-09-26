package main.java.ca.uvic.seng330.assn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * a Team holds a List of Players and Managers.
 * @author Karan Tongay (karantongay@uvic.ca)
 * @author Andreas Koenzen 
 *
 */
public class Team implements Comparable<Team> {

	private List<Player> playerList = new ArrayList<Player>();
	private int numPlayers;
	private String teamName;
	private int teamPoints;
	
	public Team(Team t) {
		playerList = t.playerList;
		numPlayers = t.numPlayers;
		teamName = t.teamName;
	}
	
	public Team(String teamName, List<Player> playerList, int numPlayers) {
		this.playerList = playerList;
		this.numPlayers = numPlayers;
		this.teamName = teamName;
	}
	
	public Team (String teamName) {
		this.teamName = teamName;
	}
	
	public void addPlayer(Player p) {
		playerList.add(p);
	}
	
	
	public List<Player> getPlayerList() {
		return playerList;
	}
	
	public int getNumPlayers() {
		return numPlayers;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public int getPoints() {
		teamPoints = 0;
		int n = playerList.size();
		Player current;
		
		for (int i = 0; i < n; i++) {
			current = playerList.get(i);
			teamPoints += current.getPoints();
		}
		
		return teamPoints;
	}
	
	public List<Player> sort() {
		Collections.sort(playerList, (p1, p2) -> p1.getPoints() - p2.getPoints());
		return playerList;
	}
	
	public int compare(Team t1, Team t2) {
		return t1.getPoints() - t2.getPoints();
	}
	
	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return getPoints() - o.getPoints();
	}

	public String toString()
	{
		
		return this.getTeamName() + " have " + this.getPoints() +" points";
	}
	
}
