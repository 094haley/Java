package ch09.P291;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈 
 * 내용 : 추상 클래스와 템플릿 메서드 P294
 */

public class CarTest {
	public static void main(String[] args) {
		
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
		
	}
}
