package step02;

/*
 * 날짜 : 2022/08/19
 * 이름 : 이해빈
 * 내용 : 백준 2단계 3번 문제. 윤년
 */

import java.util.Scanner;
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if((a % 4 ==0 && a % 100 !=0) || a % 400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		sc.close();
	}
}
