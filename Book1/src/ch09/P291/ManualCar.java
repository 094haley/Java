package ch09.P291;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈 
 * 내용 : 추상 클래스와 템플릿 메서드 P293
 */
public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}
}
