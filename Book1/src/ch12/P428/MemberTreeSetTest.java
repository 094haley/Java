package ch12.P428;

/*
 * 날짜 : 2022/09/26
 * 이름 : 이해빈
 * 내용 : TreeSet 활용하기 P432
 */

import ch12.P407.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "박서원");
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		Member memberHong = new Member(1003, "홍길동"); // 아이디 중복 회원 추가
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
		
	}
}
