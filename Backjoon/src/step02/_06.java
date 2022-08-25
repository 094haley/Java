package step02;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이해빈
 * 내용 : 백준 2단계 6번 문제. 오븐시계
 */

import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = b+c;
		
		
		if(d >= 60) {
			
			if((a+(d/60)) >= 24) {
				System.out.println( a + (d / 60) -24 + " " + (d % 60));
			}else {
				System.out.println( a + (d / 60) + " " + (d % 60));
			}
			
		}else {
			
			System.out.println(a + " " + d );
		}
		
	}
}
