package sub01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 이해빈
 * 내용 : 자바 연산자 연습문제
 */

public class Test03 {
	public static void main(String[] args) {
		int result = 0; // result를 선언하고 초기화
		int num = 1;
		
		result = num++;
		System.out.println("result : "+result);
	
		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
	}
}
