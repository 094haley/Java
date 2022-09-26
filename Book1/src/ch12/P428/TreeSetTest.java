package ch12.P428;

import java.util.TreeSet;

/*
 * 날짜 : 2022/09/26
 * 이름 : 이해빈
 * 내용 : TreeSet 테스트 P428
 * 
 * TreeSet
 *  - 데이터를 추가한 후 결과를 출력하면 결과 값이 정렬됨
 *  - 자료의 중복을 허용하지 않으면서 출력 결과 값을 정렬하는 클래스입니다. 
 */
public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
