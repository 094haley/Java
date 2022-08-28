package step03;

/* 
 * 날짜 : 2022/08/27
 * 이름 : 이해빈
 * 내용 : 백준 3단계 1번 문제. 구구단
 */

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for( int b = 1; b <= 9; b++) {
			System.out.printf("%d * %d = " + a * b, a, b);
			System.out.println();
			
		}
		
		
	}
}
