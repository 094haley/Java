package step01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 이해빈
 * 내용 : 백준 1단계 12번 문제. 나머지
 */

import java.util.Scanner;
public class _12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100-b%10)/10);
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
		sc.close();
	}
}

