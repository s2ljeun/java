package baseball;

import java.util.*;

public class BaseballProImpl implements BaseballPro {
	private Hashtable<String, Hashtable<String, Player>> ht;
	private Scanner in;
	
	public BaseballProImpl() {
		ht = new Hashtable<>();
		String[] teamName = new String[] 
			{"SSG", "LG", "KT", "Ű��", "���", "NC", "�Ե�", "�Ｚ", "�λ�", "��ȭ"};
		for(int i=0; i<teamName.length; ++i) {
			ht.put(teamName[i], new Hashtable<String, Player>());
		}
	}
	//ht�� ����;� ht�ȿ� �ؽ����̺� Ű:teamname, ��:player �� �� ���ִµ�
	//ht�� �ٸ� Ŭ������ �� ��� �������� ??
	
	//getTeam�� public String[] �޼ҵ�� �ٲٰ� �Ѥ�
	// gui���� pro ��ü ������ ����
	// ������ gui ���� String team[] = pro.getTeam();
	// �Է� ��ư�� ���õǾ��� �� idlg.teamSetting(team);�� �����ϴµ�
	// teamSetting �޼ҵ�� inputDialog �ȿ��� �ݺ������� team �ҷ�����

	private BaseballPro pro = new BaseballProImpl();
	String team[] = pro.getTeam();

	
	protected String getTeam() {
		while(true) {
			System.out.print("���ܸ��� �Է� : ");
			String team = in.next(); //in�� �ƴ� �ʵ尪�� �����ͼ�
			if (ht.containsKey(team)) {
				return team; //�������ش� > �׷��� �Ʒ� insert, trade... ���� ��밡��
			}else {
				System.out.println("���ܸ��� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
	
	@Override
	public void insert() {
		String team = getTeam();
		Hashtable<String, Player> ht2 = ht.get(team);
		System.out.print("�������� �Է� : ");
		String name = in.next();
		System.out.print("������ �Է� : ");
		int salary = in.nextInt();
		Player p = new Player(name, team, salary);
		ht2.put(name, p);
	}

	@Override
	public void trade() {
		String team = getTeam();
		Hashtable<String, Player> ht2 = ht.get(team);
		System.out.print("�������� �Է� : ");
		String name = in.next();
		if (!ht2.containsKey(name)) {
			System.out.printf("%s���ܿ��� %s �̸��� ������ �����ϴ�.", team, name);
			return;
		}
		String team2 = getTeam();
		if (team.equals(team2)) {
			System.out.println("���������� Ʈ���̵�� �ȵ˴ϴ�.");
			return;
		}
		Player p = ht2.get(name);
		ht2.remove(name);
		Hashtable<String, Player> ht3 = ht.get(team2);
		ht3.put(name, p);
	}

	@Override
	public void view() {
		String team = getTeam(); //�ʵ尪�� ���ϵ�
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
		System.out.print("������ ������ �̸� : ");
		String name = in.next();
		if (ht2.containsKey(name)) {
			ht2.remove(name);
			System.out.printf("%s������ %s������ �����Ͽ����ϴ�.", team, name);
		}else {
			System.out.printf("%s���ܿ��� %s �̸��� ������ �����ϴ�.", team, name);
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

}
