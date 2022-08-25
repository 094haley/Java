package ch03;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이해빈
 * 내용 : 성적을 학점으로 변환하는 프로그램 2
 */

import java.util.Scanner;

public class P095 {
	public static void main(String[] args) {
		int score, number;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하시오: ");
		score = sc.nextInt();
		number = score / 10; // 정수를 10으로 나누어서 소수점 이하를 없앤다.
		
		switch (number) {
		case 10:
		case 9: 
			grade = 'A';
			break;
		case 8: 
			grade = 'B';
			break;
		case 7: 
			grade = 'C';
			break;
		case 6: 
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("학점: " + grade);
	}
}
