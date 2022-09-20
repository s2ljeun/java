package baseball;

import java.util.*;  

public class BaseballProImpl implements BaseballPro {
	private Hashtable<String, Hashtable<String, Player>> ht;
	
	public BaseballProImpl() {
		ht = new Hashtable<>();
		String[] teamName = new String[] 
			{"SSG", "LG", "KT", "키움", "기아", "NC", "롯데", "삼성", "두산", "한화"};
		for(int i=0; i<teamName.length; ++i) {
			ht.put(teamName[i], new Hashtable<String, Player>());
		}
	}
	
	public String[] getTeam() {
		Set<String> set = ht.keySet();
		String[] teams = new String[set.size()];
		set.toArray(teams);
		return teams;
	}
	  
	@Override
	public void insert(Player p) {
		Hashtable<String, Player> ht2 = ht.get(p.getTeam());
		ht2.put(p.getName(), p);
	}

	@Override
	public void trade(Player p, String team) {
		Hashtable ht2 = ht.get(p.getTeam());
		ht2.remove(p.getName());
		Hashtable<String, Player> ht3 = ht.get(team);
		p.setTeam(team);
		ht3.put(p.getName(), p);
	}

	@Override
	public ArrayList<Player> view(String team) {
		Hashtable<String, Player> ht2 = ht.get(team);
		Enumeration<String> enu = ht2.keys();
		ArrayList<Player> list = new ArrayList<>();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Player p = ht2.get(key);
			list.add(p);
		}
		return list;
	}

	@Override
	public boolean delete(String team, String name) {
		Hashtable<String, Player> ht2 = ht.get(team);
		if (ht2.containsKey(name)) {
			ht2.remove(name);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
