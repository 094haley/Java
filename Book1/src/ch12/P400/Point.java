package ch12.P400;

/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : 자료형 매개변수를 두 개 사용하는 클래스 P400
 */
public class Point<T, V> {
	
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
}
