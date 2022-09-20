package baseball;

import java.util.ArrayList;
  
public interface BaseballPro {
	public void insert(Player p);
	public void trade(Player p, String team);
	public ArrayList<Player> view(String team);
	public boolean delete(String team, String name);
	public String[] getTeam();
	public void exit();
}
