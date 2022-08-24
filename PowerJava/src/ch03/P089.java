package ch03;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이해빈
 * 내용 : 짝수와 홀수 구별하기
 */

import java.util.Scanner;

public class P089 {
	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("입력된 정수는 짝수입니다.");	
		}else {
			System.out.println("입력된 정수는 홀수입니다.");
		}
		
	}
}
