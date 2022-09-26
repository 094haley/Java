package ch12;
/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : Powder 클래스 정의하기 P392
 */
public class Powder extends Material {
	
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Powder입니다.";
	}
}
