package step02;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이해빈
 * 내용 : 백준 2단계 7번 문제. 주사위 세개
 */

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ( a == b && b == c ) {
			
			System.out.println(10000+ a*1000);
			
		}else if((a == b && a != c) || 
				 (a == c && a != b)) {
			
			System.out.println(1000 + a *100);
			
		}else if(b == c && a != b) {
			
			System.out.println(1000 + b*100);
			
		}else {
			if (a > b && a > c) {
				
				System.out.println(a*100);
				
			}else if(b > a && b > c) {
				
				System.out.println(b*100);
				
			}else if (c > a && c > b) {
				
				System.out.println(c*100);
				
			}	
		}
	}
}
