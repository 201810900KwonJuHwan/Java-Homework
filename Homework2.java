package Homewokr2;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stude= new Student[3];
		for(int i=0; i<3; i++) {
		System.out.printf("�л��� �й�, �̸�, ����, ��ȭ��ȣ�� �Է��ϼ���:");
		stude[i]=new Student();
		stude[i].studentId=sc.nextInt();
		stude[i].name=sc.next();
		stude[i].major=sc.next();
		stude[i].phoneNumber=sc.next();
		String hypen = stude[i].phoneNumber;
	    String str1= hypen.substring(0,3);
	    String str2= hypen.substring(3,7);
	    String str3= hypen.substring(7,11);
	    stude[i].str = str1+"-"+str2+"-"+str3;
		}
		
	    
		System.out.println("�Էµ� �л����� ������ ������ �����ϴ�.");
		System.out.println("ù��°�л�: "+stude[0].studentId+stude[0].name+stude[0].major+stude[0].str);
		System.out.println("�ι�°�л�: "+stude[1].studentId+stude[1].name+stude[1].major+stude[1].str);
		System.out.println("����°�л�: "+stude[2].studentId+stude[2].name+stude[2].major+stude[2].str);
		
		sc.close();
	}

}
