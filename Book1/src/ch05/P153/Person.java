package ch05.P153;

/*
 * 날짜 : 2022/09/19
 * 이름 : 이해빈
 * 내용 : 생성자 만들기 P153
 */
public class Person {
	
	String name;
	float height;
	float weight;
	
	public Person() {} // 디폴트 생성자 직접 추가
	
	public Person(String pname) {
		name = pname;
	}
	
	// 생성자 사용하기 P157
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = weight;
		
	}
}
