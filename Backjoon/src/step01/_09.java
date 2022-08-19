package step01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 이해빈
 * 내용 : 백준 1단계 8번 문제. 1998년생인 내가 태국에서는 2541년생?!
 */

import java.util.Scanner;
public class _09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(a-543);
		sc.close();
	}
}
