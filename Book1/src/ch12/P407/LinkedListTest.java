package ch12.P407;

import java.util.LinkedList;

/*
 * 날짜 : 2022/09/26
 * 이름 : 이해빈
 * 내용 : LinkedList 테스트하기
 */
public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D"); // 링크드 리스트의 첫 번째 위치에 D 추가
		System.out.println(myList);
		
		myList.addFirst("0"); // 연결 리스트의 맨 앞에 0 추가
		System.out.println(myList);
		
		System.out.println(myList.removeLast()); // 연결 리스트의 맨 뒤 요소 삭제 후 해당 요소를 출력
		System.out.println(myList);
	
	}
}
