package ch13;

/*
 * 날짜 : 2022/09/28
 * 이름 : 이해빈
 * 내용 : 지역 내부 클래스 예제 P455
 */

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;							// 지역변수
		
		class MyRunnable implements Runnable {	// 지역 내부 클래스
			int localNum = 10;
			
			public void run() {
				//num = 100; 		- 지역 변수는 상수로 바뀌므로 값 변경불가
				//i = 100;			- 매개변수도 상수로 바뀌므로 값 변경불가
				System.out.println("i = " + i );
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10); // 메서드 호출
		runner.run();
		
	}
}
