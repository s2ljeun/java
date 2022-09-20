package baseball;

public class Player {
	private String name;
	private String team;
	private int salary;
	
	public Player(String name, String team, int salary) {
		this.name = name;
		this.team = team;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getTeam() {
		return team;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	public void disp() {
		System.out.printf("%s¥‘¿« ø¨∫¿¿∫ %dø¯ ¿‘¥œ¥Ÿ.\n", name, salary);
	}
}





