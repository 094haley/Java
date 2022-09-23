package ch09.P291;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈 
 * 내용 : 추상 클래스와 템플릿 메서드 P292
 */

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
}
