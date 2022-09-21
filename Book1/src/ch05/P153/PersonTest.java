package ch05.P153;

/*
 * 날짜 : 2022/09/19
 * 이름 : 이해빈
 * 내용 : 생성자 테스트하기 P153, 테스트 클래스 구현하기 P158
 */
public class PersonTest {
	public static void main(String[] args) {

		// 디폴트 생성자로 클래스를 생성 후 인스턴스 변수 값을 따로 초기화
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		// 인스턴스 변수 초기화와 동시에 클래스 생성
		Person personLee = new Person("이순신", 175, 75);
	}
}
