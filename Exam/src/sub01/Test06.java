package sub01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 이해빈
 * 내용 : 자바 삼항연산자 연습문제
 */

import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.println("y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다."; //문자열을 받으니까 String result
		
		System.out.println(result);
	}
}
