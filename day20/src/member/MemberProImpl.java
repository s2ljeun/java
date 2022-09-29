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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		
		if (ht.containsKey(name)) {
			System.out.println(name+"님은 이미 존재합니다. 다시 입력해 주세요!!");
			insert();
		}else {
			System.out.print("전화번호를 입력 : ");
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
		System.out.print("삭제할 회원의 이름 : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name+"님을 삭제하였습니다.");
		}else {
			System.out.println(name+"님은 저희 회원이 아닙니다.");
		}
	}

	@Override
	public void edit() {
		System.out.print("수정할 회원의 이름 : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			Member edit = ht.get(name);
			System.out.println(name+"님의 현재 전화번호는 " + edit.getTel()+"번 입니다.");
			System.out.print("수정하실 번호를 입력 : ");
			edit.setTel(in.next());
			System.out.println(name+"님의 전화번호를 수정하였습니다.");
		}else {
			System.out.println(name+"님은 저희 회원이 아닙니다.");
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
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
		ht.clear(); 		//기존 자료를 모두 지워라
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
				System.out.println("파일에 있는 자료를 모두 업로드 하였습니다.");
				break;
			}
		}
		dis.close();
		*/
	}
}









