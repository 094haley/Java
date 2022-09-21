package ch06;

/*
 * 날짜 : 2022/09/20
 * 이름 : 이해빈
 * 내용 : private 생성자 만들기 P194
 */
public class Company {

	private static Company instance = new Company(); // 유일하게 생성한 인스턴스
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
