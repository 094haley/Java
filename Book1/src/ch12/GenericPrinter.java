package ch12;

/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : GenericPrinter<T> 클래스 정의하기 P393
 */

public class GenericPrinter<T extends Material> { // extends예약어로 사용할 수 있는 자료형에 제한을 둠
	
	private T material; // T자료형으로 선언한 변수
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); // 상위 클래스 Material의 메서드 호출
	}
}
