package ch09;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈
 * 내용 : NoteBook 클래스 구현하기 P286
 */
public abstract class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook display");
	} // 추상 메서드를 하나만 구현하였기 때문에 추상 클래스가 됨
}
