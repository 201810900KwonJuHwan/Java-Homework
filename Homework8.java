package Homewokr2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		Map<String, String> m1= new HashMap<>();
		m1.put("myId", "myPass");
		m1.put("myId2", "myPass2");
		m1.put("myId3", "myPass3");
		
		Scanner sc= new Scanner(System.in);
		String str1;
		String str2;
		
		int cnt=1;
		while(cnt==1) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.printf("id: ");
			str1=sc.next();
			str1=str1.trim();
			if(m1.containsKey(str1)) {
				System.out.printf("password: ");
				str2=sc.next();
				str2=str2.trim();
				if((m1.get(str1)).equals(str2)){
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					cnt=0;
				}
				else
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
					
			}
			else {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			}
			System.out.println();
		}

	}

}
