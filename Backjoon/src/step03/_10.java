package step03; /// 이 문제 질문하기

/*
 * 날짜 : 2022/08/27
 * 이름 : 이해빈
 * 내용 : 백준 3단계 10번 문제. X보다 작은 수 
 */

import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
	
		for (int i = 0; i < n ; i++) {
			
			int a = sc.nextInt();
			if (a < x) {
				System.out.print(a + " ");
			}
		}
	}
}
