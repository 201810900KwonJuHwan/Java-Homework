import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("�� ���� ���� �Է��� �����ΰ���? ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = 0;
		
		System.out.printf("���� �Է��ϼ���: ");
		for(int i=0; i<n; i++) {
			k= sc.nextInt();
			if(i==0) {
				arr[0]=k;
				arr[1]=k;
			}						//�ʱ�ȭ
			if(k >arr[0])			//�ִ밪����
				arr[0]=k;
			if(k <arr[1])			//�ּҰ�����
				arr[1]=k;
			else
				arr[i]=k;
		}
		System.out.println("�ִ밪: "+arr[0]);
		System.out.println("�ּҰ�: "+arr[1]);
		
		

	}

}
