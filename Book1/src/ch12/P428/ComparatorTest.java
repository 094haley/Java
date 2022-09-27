package ch12.P428;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2022/09/27
 * 이름 : 이해빈
 * 내용 : Comparator 인터페이스 사용하기 P437
 */

class MyCompare implements Comparator<String> {
	
	@Override
	public int compare(String s1, String s2) {
		return(s1.compareTo(s2)) * -1 ; // 내림차순으로 정렬
	}
}

public class ComparatorTest {
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(new MyCompare()); // TreeSet 생성자의 매개변수로 정렬 방식을 지정
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
		
	}
}
