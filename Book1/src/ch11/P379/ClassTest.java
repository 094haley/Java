package ch11.P379;

/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : Person의 Class 클래스 가져오기 P380
 */
public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		Class pClass1 = person.getClass(); // Object의 getClass()메서드 사용하기
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
	
		Class pClass3 = Class.forName("ch11.P379.Person"); // 클래스 이름으로 가져오기
		System.out.println(pClass3.getName());
	}
}
