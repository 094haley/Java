package step01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 이해빈
 * 내용 : 백준 1단계 11번 문제. 나머지
 */

import java.util.Scanner;
public class _11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println((a%c)*(b%c)%c);
		
		sc.close();
	}
}
