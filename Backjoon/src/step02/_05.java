package step02;

/*
 * 날짜 : 2022/08/19
 * 이름 : 이해빈
 * 내용 : 백준 2단계 5번 문제. 알람시계
 */

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
	Scanner	sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	
	
	if(b < 45) {
		if(a == 0) {
			System.out.println( 23 +" "+ (b+15));
			
		}else {
			System.out.println((a-1)+" "+ (b+15));
			
		}
		
	} else {
		
		System.out.println(a + " " + (b-45));
	}
	}
}
