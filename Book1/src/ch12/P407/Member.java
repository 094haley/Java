package ch12.P407;

/*
 * 날짜 : 2022/09/26
 * 이름 : 이해빈
 * 내용 : Member 클래스 구현하기 P407
 */
public class Member {
	
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
}
