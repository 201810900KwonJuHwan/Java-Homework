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
		System.out.printf("두 수를 입력하세요: ");
		Homework4 a= new Homework4();
		System.out.println("두 수의 최대공약수는 "+a.gcd(sc.nextInt(),sc.nextInt())+"입니다.");

	}

}
