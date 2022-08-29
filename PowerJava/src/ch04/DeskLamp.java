package ch04;

/*
 * 날짜 : 2022/08/29
 * 이름 : 이해빈
 * 내용 : DeskLamp 클래스 작성하고 객체 생성해보기
 */

public class DeskLamp {
	// 인스턴스 변수 정의
	private boolean isOn; // 켜짐이나 꺼짐과 같은 램프의 상태
	
	// 메소드 정의
	public void turnOn() { isOn = true; }
	public void turnOff() { isOn = false; }
	public String toString() {
		
		return " 현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
	}
}
