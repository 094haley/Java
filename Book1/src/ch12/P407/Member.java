package ch12.P407;

/*
 * 날짜 : 2022/09/26
 * 이름 : 이해빈
 * 내용 : Member 클래스 구현하기 P407
 */
public class Member implements Comparable<Member>{

	private int memberId;
	private String memberName;

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;

	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
	// HashSet 활용하기 P427
	@Override
	public int hashCode() {
		return memberId; // hashCode() 메서드가 회원아이디를 반환하도록 재정의
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true; // 매개변수로 받은 회원 아이디가 자신의 회원아이디와 같디면 true 반환
			}else {
				return false;
			}
		}return false;
	}
	
	// Comparable 인터페이스 구현하기 P434
	@Override
	private int compareTo(Member member) {
		return(this.memberId - member.memberId);
	}
	
}
