package ch09.P305;

/*
 * 날짜 : 2022/09/24
 * 이름 : 이해빈
 * 내용 : 상수 사용하기 P307
 */
public class UsingDefine {
	public static void main(String[] args) {
		
		System.out.println(Define.GOOD_MORNING); // static으로 선언했으므로 인스턴스를 생성하지 않고 클래스 이름으로 창조 가능
		System.out.println("최솟값은 " + Define.MIN + "입니다.");
		System.out.println("최댓값은 " + Define.MAX + "입니다.");
		System.out.println("수학 과목 코드 값은 " + Define.MATH + "입니다.");
		System.out.println("영어 과목 코드 값은 " + Define.ENG + "입니다.");
	
	}
}
