import java.util.*;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù��° 2������ �Է� : ");
		String binary1 = in.next();
		System.out.print("�ι�° 2������ �Է� : ");
		String binary2 = in.next();
		
		if (binary1.length() > binary2.length()) {
			String imsi = binary1;
			binary1 = binary2;
			binary2 = imsi;
		}
		
		int len = binary2.length()-binary1.length();
		
		for(int i=0; i<len; ++i) {
			binary1 = "0" + binary1;
		}

		System.out.println(binary2);
		System.out.println(binary1);	
		
		len = binary1.length();	
		String result = "";
		for(int i=len-1; i>=0; --i) {
			char ch1 = binary2.charAt(i);
			char ch2 = binary1.charAt(i);
			if (ch1-ch2 >= 0) {
				result = (ch1-ch2) + result;
			}else {
				result = "1" + result;
				StringBuffer sb = new StringBuffer(binary2);//ū���� �����ؼ� ����� �ϼ��Ѵ�
				int t = i;//���� ��ġ�� t�� �ű��
				while(true) {
					t--;
					char ch = sb.charAt(t);
					sb.delete(t, t+1);
					if (ch == '1') {
						sb.insert(t, "0");
						break;
					}else {
						sb.insert(t, "1");
					}
				}
				binary2 = new String(sb);
			}
		}
		
		System.out.println(result);
	}
}







