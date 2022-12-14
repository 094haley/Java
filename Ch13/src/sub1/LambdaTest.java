package sub1;

/*
 * 날짜 : 2022/09/20
 * 이름 : 이해빈
 * 내용 : 람다식 실습하기
 * 
 * 람다식(Lambda)
 *  - 함수에 프로그래밍을 지원하기 위한 구문혀식
 *  - 자바에서는 @FunctionalInterface 인터페이스를 이용해서 람다식 정의
 * 
 */
public class LambdaTest {
	public static void main(String[] args) {
		
		// 람다식 정의
		Type1 t1 = () -> {System.out.println("Type1 람다식 실행...");};
		Type2 t2 = (x) -> System.out.println("Type2 람다식 실행 : " + x);
		Type3 t3 = (x, y) -> x + y;
		
		// 람다식 호출
		t1.f();
		t2.f(3);
		int result = t3.f(2, 3);
	
		System.out.println("result : " + result);
	}
}
