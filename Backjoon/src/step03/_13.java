package step03;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이해빈
 * 내용 : 백준 3단계 13번 문제. 더하기 사이클
 */

import java.util.Scanner;
public class _13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n;
		int count = 0;
		
		while(true) {

			int b = (a / 10) + a % 10;
			a = (a % 10)*10 + b % 10;
			count += 1;
			if (a == n)
				break;
				
		}
		System.out.println(count);
	}
}
