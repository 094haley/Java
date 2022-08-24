package ch02;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이해빈
 * 내용 : 비트 연산자 실습하기
 */

public class P073 {
	public static void main(String[] args) {
		
		byte status = 0b01101110;
		System.out.println("문열림 상태=" + ((status & 0b000100)!=0));
	}
}
