package ch11.P379;
/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : Person 클래스의 인스턴스 생성하기 P383
 */
public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("ch11.P379.Person");
		Person person2 = (Person)pClass.newInstance(); // Class 클래스의 newInstance() 메서드로 생성하기
		System.out.println(person2);
		
	}
}
