package baseball;

import java.util.*;

public class BaseballProImpl implements BaseballPro {
	private Hashtable<String, Hashtable<String, Player>> ht;
	private Scanner in;
	
	public BaseballProImpl() {
		ht = new Hashtable<>();
		String[] teamName = new String[] 
			{"SSG", "LG", "KT", "키움", "기아", "NC", "롯데", "삼성", "두산", "한화"};
		for(int i=0; i<teamName.length; ++i) {
			ht.put(teamName[i], new Hashtable<String, Player>());
		}
		in = new Scanner(System.in);
	}
	
	protected String getTeam() {
		while(true) {
			System.out.print("구단명을 입력 : ");
			String team = in.next();
			if (ht.containsKey(team)) {
				return team;
			}else {
				System.out.println("구단명이 틀렸습니다. 다시 입력해 주세요!!");
			}
		}
	}
	
	@Override
	public void insert() {
		String team = getTeam();
		Hashtable<String, Player> ht2 = ht.get(team);
		System.out.print("선수명을 입력 : ");
		String name = in.next();
		System.out.print("연봉을 입력 : ");
		int salary = in.nextInt();
		Player p = new Player(name, team, salary);
		ht2.put(name, p);
	}

	@Override
	public void trade() {
		String team = getTeam();
		Hashtable<String, Player> ht2 = ht.get(team);
		System.out.print("선수명을 입력 : ");
		String name = in.next();
		if (!ht2.containsKey(name)) {
			System.out.printf("%s구단에는 %s 이름의 선수가 없습니다.", team, name);
			return;
		}
		String team2 = getTeam();
		if (team.equals(team2)) {
			System.out.println("같은팀으로 트레이드는 안됩니다.");
			return;
		}
		Player p = ht2.get(name);
		ht2.remove(name);
		Hashtable<String, Player> ht3 = ht.get(team2);
		ht3.put(name, p);
	}

	@Override
	public void view() {
		String team = getTeam();
		Hashtable<String, Player> ht2 = ht.get(team);
		Enumeration<String> enu = ht2.keys();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Player p = ht2.get(key);
			p.disp();
		}
	}

	@Override
	public void delete() {
		String team = getTeam();
		Hashtable<String, Player> ht2 = ht.get(team);
		System.out.print("삭제할 선수의 이름 : ");
		String name = in.next();
		if (ht2.containsKey(name)) {
			ht2.remove(name);
			System.out.printf("%s구단의 %s선수를 삭제하였습니다.", team, name);
		}else {
			System.out.printf("%s구단에는 %s 이름의 선수가 없습니다.", team, name);
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
