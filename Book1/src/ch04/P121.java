package ch04;

/*
 * 날짜 : 2022/08/21
 * 이름 : 이해빈
 * 내용 : break문 예제
 */

public class P121 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) { // 조건식을 생략하는 대신 break문을 사용
			sum += num;
			if(sum >= 100)
				break;			
		}
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
	}
}
