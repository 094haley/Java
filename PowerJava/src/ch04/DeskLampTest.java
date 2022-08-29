package ch04;

/*
 * 날짜 : 2022/08/29
 * 이름 : 이해빈
 * 내용 : DeskLamp 클래스 작성하고 객체 생성해보기
 */

public class DeskLampTest {
	public static void main(String[] args) {
		
		DeskLamp myLamp = new DeskLamp();
		
		myLamp.turnOn();
		System.out.println(myLamp);
		myLamp.turnOff();
		System.out.println(myLamp);
	}
}
