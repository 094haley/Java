package ch09.P291;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈
 * 내용 : 추상 클래스와 템플릿 메서드 P291
 */
public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
