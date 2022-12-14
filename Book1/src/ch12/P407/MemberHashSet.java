package ch12.P407;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 날짜 : 2022/09/26
 * 이름 : 이해빈
 * 내용 : HashSet 활용하기
 */
public class MemberHashSet {
	private HashSet<Member> hashSet; // HashSet 선언
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>(); // Hashset 생성
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator(); // iterator를 이용하여 순회함
		
		while(ir.hasNext()) {
			Member member = ir.next(); // 회원을 하나씩 가져와서
			int tempId = member.getMemberId(); // 아이디 비교
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
}
