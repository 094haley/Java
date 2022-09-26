package ch10.P340;

/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : Queue 인터페이스 정의하기 P341 
 */
public interface Queue {
	
	void enQueue(String title); // 배열의 맨 마지막에 추가
	String deQueue(); // 배열의 맨 처음 항목 반환
	int getSize(); // 현재 Queue에 있는 개수 반환
}
