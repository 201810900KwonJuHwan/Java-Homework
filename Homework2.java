package Homewokr2;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stude= new Student[3];
		for(int i=0; i<3; i++) {
		System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
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
		
	    
		System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
		System.out.println("첫번째학생: "+stude[0].studentId+stude[0].name+stude[0].major+stude[0].str);
		System.out.println("두번째학생: "+stude[1].studentId+stude[1].name+stude[1].major+stude[1].str);
		System.out.println("세번째학생: "+stude[2].studentId+stude[2].name+stude[2].major+stude[2].str);
		
		sc.close();
	}

}
