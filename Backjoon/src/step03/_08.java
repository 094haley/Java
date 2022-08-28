package step03;

/*
 * 날짜 : 2022/08/27
 * 이름 : 이해빈
 * 내용 : 백준 3단계 8번 문제. 별찍기 - 1
 */

import java.util.*;

public class _08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t ; i ++) {
			for(int j = 0; j <= i; j ++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
