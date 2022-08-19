package step01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 이해빈
 * 내용 : 백준 1단계 7번 문제. 사칙연산
 */

import java.util.Scanner;
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		sc.close();
	}
}
