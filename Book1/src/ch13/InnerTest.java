package ch13;

import ch13.OutClass.InStaticClass;

/*
 * 날짜 : 2022/09/28
 * 이름 : 이해빈
 * 내용 : 인스턴스 내부 클래스 예제 P450 , 정적 내부 클래스 예제 P453
 */

class OutClass { 						// 외부클래스
	private int num = 10;				// 외부 클래스 private 변수
	private static int sNum = 20;		// 외부 클래스 정적 변수

	
	private InClass inClass;
	
	public OutClass() {				// 외부클래스 디폴트 생성자. 외부클래스가 생성된 후에 내부 클래스 생성 가능
		inClass = new InClass();
	}
	
	class InClass { 					// 인스턴스 내부 클래스
		int inNum = 100;
		//static int sInNum = 200; 		- 인스턴스 내부 클래스에 정적 변수 선언 불가능.
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OunClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
		
		//static void sTest() {} 		- 정적 메서드 역시 정의 불가능
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	
	// 정적 내부 클래스 예제 P453
	static class InStaticClass {		// 정적 내부 클래스
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10;				-  외부 클래스의 인스턴스 변수는 사용불가
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용 가능)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() {			// 정적 내부 클래스의 정적 메서드
			//num += 10;
			//inNum += 10;				// 외부 클래스와 내부 클래스의 인스턴스 변수는 사용 불가
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
	}
}


public class InnerTest {
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass(); // 내부 클래스 기능 호출
		
		System.out.println();
		
		// 정적 내부 클래스 예제 P453
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		
		System.out.println();
		System.out.println("정적 내부 클래스의 정적메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}
