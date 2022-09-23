package ch09;

/*
 * 이름 : 이해빈
 * 날짜 : 2022/09/23
 * 내용 : 추상 클래스 구현하기 P283
 */
public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
