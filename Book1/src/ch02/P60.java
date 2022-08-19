package ch02;

/*
 * 날짜 : 2022/08/18
 * 이름 : 이해빈
 * 내용 : 자료형 추론
 */

public class P60 {
	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // 다른 문자열은 대입 가능
		//str = 3;
	}
}
