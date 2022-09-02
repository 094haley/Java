package ch06;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이해빈
 * 내용 : Person 클래스와 Student 클래스 만들어보기
 */

class Person {
	private String regnumber; // 주민등록 번호, 자식클래스에서 접근 불가
	private double weight; // 체중, 자식 클래스에서 접근 불가
	protected int age; // 나이, 자식 클래스에서 접근 가능
	String name; // 이름, 어디서나 접근 가능
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight (double weight) {
		this.weight = weight;
	}
}

class Student extends Person {
	int id;
}

public class StudentTest {
	public static void main(String[] args) {
		Student obj = new Student();
		
		//obj.regnumber = "123456-123456";
		//obj.weight = 75.0;
		
		obj.age = 21;
		obj.name = "Kim";
		obj.setWeight(75.0);
	}
}
