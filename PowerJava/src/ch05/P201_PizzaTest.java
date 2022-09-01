package ch05;

/*
 * 날짜 : 2022/09/01
 * 이름 : 이해빈
 * 내용 : 정적 변수 사용하기
 */

public class P201_PizzaTest {

	public static void main(String[] args) {
		
		Pizza1 p1 = new Pizza1("Super Suprme");
		Pizza1 p2 = new Pizza1("Cheese");
		Pizza1 p3 = new Pizza1("Pepperoni");
		
		int n = Pizza1.count;
		
		System.out.println("지금까지 판매된 피자 개수 = " + n);
				
	}
}
