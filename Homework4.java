package Homework4;

import java.util.Scanner;

public class Homework4 {
	int gcd(int m,int n) {
		if(m==0)
			return m;
		else if(m%n ==0)
			return n;
		else {
			m=m%n;
			return gcd(n,m);
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.printf("�� ���� �Է��ϼ���: ");
		Homework4 a= new Homework4();
		System.out.println("�� ���� �ִ������� "+a.gcd(sc.nextInt(),sc.nextInt())+"�Դϴ�.");

	}

}
