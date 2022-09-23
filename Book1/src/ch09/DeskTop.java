package ch09;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈
 * 내용 : 추상 클래스 상속받기 P285 , 추상 메서드 구현하기 P286
 */
public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
}
