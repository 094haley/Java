package ch12.P407;

import java.util.HashSet;

/*
 * 날짜 : 2022/09/26
 * 이름 : 이해빈
 * 내용 : HashSet 테스트하기 P423
 * 
 * HashSet
 *  - 집합 자료 구조를 구현하며 중복을 허용하지 않음 
 */
public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("임정순");
		hashSet.add("박현정");
		hashSet.add("홍연의");
		hashSet.add("강감찬");
		hashSet.add("강감찬");
		
		System.out.println(hashSet);
		
	}
}
