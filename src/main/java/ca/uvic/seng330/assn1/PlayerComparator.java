package main.java.ca.uvic.seng330.assn1;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Object> {
	@Override
    public int compare(Object o1, Object o2)
    {
        Player p1 = (Player)o1;
        Player p2 = (Player)o2;
		
		return p1.getPoints()- p2.getPoints();
    }

}
