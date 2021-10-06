import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("몇 개의 수를 입력할 예정인가요? ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = 0;
		
		System.out.printf("수를 입력하세요: ");
		for(int i=0; i<n; i++) {
			k= sc.nextInt();
			if(i==0) {
				arr[0]=k;
				arr[1]=k;
			}						//초기화
			if(k >arr[0])			//최대값저장
				arr[0]=k;
			if(k <arr[1])			//최소값저장
				arr[1]=k;
			else
				arr[i]=k;
		}
		System.out.println("최대값: "+arr[0]);
		System.out.println("최소값: "+arr[1]);
		
		

	}

}
