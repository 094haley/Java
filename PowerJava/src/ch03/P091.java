package ch03;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이해빈
 * 내용 : 성적 처리 예제
 */

import java.util.Scanner;

public class P091 {
	public static void main(String[] args) {
		int grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		
		grade = sc.nextInt();
		if(grade >= 90) {
			System.out.println("학점 A");
		}else if(grade >= 80) {
			System.out.println("학점 B");
		}else if(grade >= 70) {
			System.out.println("학점 C");
		}else if(grade >= 60) {
			System.out.println("학점 D");
		}else {
			System.out.println("학점 F");
		}
			
		
	}
}
