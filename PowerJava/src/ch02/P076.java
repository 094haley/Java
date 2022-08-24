package ch02;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이해빈
 * 내용 : 조건 연산자 사용하기
 */

public class P076 {
	public static void main(String[] args) {
		double area1 = 2 * 3.141592 * 20 * 20;
		double area2 = 3.141592 * 30 * 30;
		
		System.out.println("20cm 피자 2개의 면적=" + area1);
		System.out.println("30cm 피자 면적=" + area2);
		System.out.println((area1 > area2)? "20cm 두 개를 주문하세요." : "30cm 한 개를 주문하세요.");
		
	}
}
