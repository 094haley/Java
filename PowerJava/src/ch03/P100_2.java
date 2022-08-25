package ch03;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이해빈
 * 내용 : 팩토리얼 계산하기
 */

import java.util.Scanner;

public class P100_2 {
	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.println("정수를 입력하시오:");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.printf("%d!은 %d입니다.\n", n, fact);
	}
}
