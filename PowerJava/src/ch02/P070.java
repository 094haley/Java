package ch02;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이해빈
 * 내용 : 형변환 실습하기
 */

import java.util.Scanner;

public class P070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("초를 입력하시오.");
		int time = sc.nextInt();
		int sec = time % 60;
		int min = time / 60;
		
		System.out.println(time + "초는 " + min + "분 " + sec + "초입니다." );
		
		
	}
}
