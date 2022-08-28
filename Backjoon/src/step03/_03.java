package step03;

/* 
 * 날짜 : 2022/08/27
 * 이름 : 이해빈
 * 내용 : 백준 3단계 3번 문제. 합
 */

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tot = 0;
		for(int i = 1; i <= n; i ++) {
			tot += i;
		}
		
		System.out.println(tot);
	}
}
