package ch12.P443;

import ch12.P407.Member;

/*
 * 날짜 : 2022/09/28
 * 이름 : 이해빈
 * 내용 : TreeMap 활용하기 P444
 */
public class MemberTreeMapTest {
	public static void main(String[] args) {
		
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberSon = new Member(1002, "손민국");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		

	}
}
