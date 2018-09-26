package main.java.ca.uvic.seng330.assn1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class League implements Iterable<Team> {

	private List<Team> teamList = new ArrayList<Team>();
	private String leagueName;
	
	public League(League l) {
		teamList = l.teamList;
	}
	
	public League(List<Team> teamList) {
		this.teamList = teamList;
	}
	
	public League(String leagueName) {
		this.leagueName = leagueName;
	}
	
	public void addTeam(Team t) {
		teamList.add(t);
	}
	
	public List<Team> sort() {
		/*int n = teamList.size();
		Team t1, t2, temp;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n-1); j++) {
				t1 = teamList.get(j-1);
				t2 = teamList.get(j);
				if (t1.getTeamPoints() < t2.getTeamPoints()) {
					temp = t2;
					t2 = t1;
					t1 = temp;
				}
			}
		}*/
		Collections.sort(teamList, (t1, t2) -> t1.getPoints() - t2.getPoints());
		return teamList;
	}
	
	@Override
	public Iterator<Team> iterator() {
		Iterator<Team> it = new Iterator<Team>() {
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				return index < teamList.size() && teamList.get(index) != null;
			}
			
			@Override
			public Team next() {
				return teamList.get(index++);
			}
			
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
		return it;
	}
	
	
	public String toString(String name)
	{
		Team t = new Team("");
		for (Team team : teamList) {
			if(team.getTeamName().equalsIgnoreCase(name))
				t = team;
		}
		
		return t.getTeamName() + " have " + t.getPoints() +" points.";
	}
	
}
