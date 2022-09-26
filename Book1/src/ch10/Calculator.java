package ch10;

/*
 * 날짜 : 2022/09/24
 * 이름 : 이해빈
 * 내용 : 인터페이스 구현하기 P316 
 */
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
} // times()와 devide()를 구현하지 않았으므로 Calculator는 추상 클래스이다.
