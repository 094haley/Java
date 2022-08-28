package step03;

/* 
 * 날짜 : 2022/08/27
 * 이름 : 이해빈
 * 내용 : 백준 3단계 4번 문제. 영수증
 */

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int tot = 0;
		
		for (int i = 1; i <= b; i++) {
			
			int c = sc.nextInt();
			int d = sc.nextInt();
			tot += c * d;
		}
		
		if (a == tot) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	
		
	}

}
