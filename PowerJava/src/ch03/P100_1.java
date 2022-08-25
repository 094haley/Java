package ch03;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이해빈
 * 내용 : 정수의 합 계산하기
 */

public class P100_1 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합: " +sum);
	}
}
