package step03;

/*
 * 날짜 : 2022/08/27
 * 이름 : 이해빈
 * 내용 : 백준 3단계 9번 문제. 별찍기 - 2
 */

import java.util.Scanner;

public class _09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i ++) {
			
			for(int j = n; j > i ; j--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < i ; j ++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
