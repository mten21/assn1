package main.java.ca.uvic.seng330.assn1;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {
	@Override
    public int compare(Player p1, Player p2)
    {
        return p1.getPoints()- p2.getPoints();
    }

}
