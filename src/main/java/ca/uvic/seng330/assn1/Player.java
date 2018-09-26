package main.java.ca.uvic.seng330.assn1;

/**
 * A Player belongs to a team.
 *
 */
public class Player {
	private int points;
	private String name;
	public enum Position{ DEFENDER, WINGER, CENTRE, GOALTENDER }
	private Position position;
	
	public Player(Player p) {
		position = p.position;
		points = p.points;
		name = p.name;
	}
	
	public Player(String name, int points, Position position) {
		this.name = name;
		this.position = position;
		this.points = points;
	}
	
	public int getPoints() {
		return points;
	}
	
	public String getName() {
		return name;
	}
	
	public Position getPosition() {
		return position;
	}
}
