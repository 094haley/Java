package ch09.P305;

/*
 * 날짜 : 2022/09/24
 * 이름 : 이해빈
 * 내용 : final 실습하기 P305
 */
public class Constant {
	
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		
		Constant cons =new Constant();
		cons.num = 50;
//		cons.NUM = 200; - 상수에 값을 대입하여 오류 발생
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	
	}
}
