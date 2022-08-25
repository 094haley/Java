package ch03;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이해빈
 * 내용 : -1의 값이 입력될 때까지 합계 계산하기
 */

import java.util.Scanner;

public class P103 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0, value = 0;
		
		while(value != -1) {
			sum = sum + value;
			System.out.print("정수를 입력하시오: ");
			value = sc.nextInt();
		}
		
		System.out.println("정수의 합은 " + sum + "입니다.");
	}
}
