package ch04;

/*
 * 날짜 : 2022/08/23
 * 이름 : 이해빈
 * 내용 : DeskLamp 클래스 작성하고 객체 생성해보기
 */
public class P150 {
	
	// DeskLamp
	
	// 인스턴스 변수 정의
	private boolean isOn;
	
	// 메서드 정의
	public void turnOn() {
		isOn = true;
	}
	public void turnOff() {
		isOn = false;
	}
	public String toString() {
		return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
	}
	
	
	// DeskLampTest
	
	public static void main(String[] args) {
		
		// 객체를 생성하려면 new 예약어를 사용한다.
		
		DeskLamp myLamp = new DeskLamp();
		
		// 객체의 메소드를 호출하려면 도트 연산자인 .을 사용한다.
		myLamp.turnOn();
		System.out.println(myLamp);
		myLamp.turnOff();
		System.out.println(myLamp);
	}
	
	
}
