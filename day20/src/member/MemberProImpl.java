package member;
import java.util.*;
import java.io.*;

public class MemberProImpl implements MemberPro {
	Hashtable<String, Member> ht;
	Scanner in;
	File dir, data;
		
	public MemberProImpl() {
		ht = new Hashtable<>();
		in = new Scanner(System.in);
		dir = new File("G:\\jieun\\study\\day20\\src\\member");
		data = new File(dir, "data.txt");
	}
	
	@Override
	public void insert() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		
		if (ht.containsKey(name)) {
			System.out.println(name+"���� �̹� �����մϴ�. �ٽ� �Է��� �ּ���!!");
			insert();
		}else {
			System.out.print("��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			Member insert = new Member(name, tel);
			ht.put(name, insert);
		}
	}

	@Override
	public void view() {
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()) {
			//Object obj = enu.nextElement();
			//String key = (String)obj;
			String key = enu.nextElement();
			Member view = ht.get(key);
			view.disp();
		}
	}

	@Override
	public void delete() {
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name+"���� �����Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		}
	}

	@Override
	public void edit() {
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			Member edit = ht.get(name);
			System.out.println(name+"���� ���� ��ȭ��ȣ�� " + edit.getTel()+"�� �Դϴ�.");
			System.out.print("�����Ͻ� ��ȣ�� �Է� : ");
			edit.setTel(in.next());
			System.out.println(name+"���� ��ȭ��ȣ�� �����Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

	@Override
	public void save() throws IOException {
		FileWriter fw = new FileWriter(data);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Member view = ht.get(key);
			pw.println(view.getName()+"@"+view.getTel());
			pw.flush();
		}
		pw.close();
		/*
		FileOutputStream fos = new FileOutputStream(data);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Member view = ht.get(key);
			dos.writeUTF(view.getName());
			dos.writeUTF(view.getTel());
			dos.flush();
		}
		dos.close();
		*/
	}

	@Override
	public void load() throws IOException{
		ht.clear(); 		//���� �ڷḦ ��� ������
		FileReader fr = new FileReader(data);
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String str = br.readLine();
			if (str == null) break;
			String[] data = str.split("@");
			Member member = new Member(data[0], data[1]);
			ht.put(data[0], member);
		}
		/*
		FileInputStream fis = new FileInputStream(data);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		while(true) {
			try {
				String name = dis.readUTF();
				String tel = dis.readUTF();
				Member member = new Member(name, tel);
				ht.put(name, member);
			}catch(EOFException e) {
				System.out.println("���Ͽ� �ִ� �ڷḦ ��� ���ε� �Ͽ����ϴ�.");
				break;
			}
		}
		dis.close();
		*/
	}
}









