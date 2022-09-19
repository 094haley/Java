package ch06;

/*
 * 날짜 : 2022/09/19
 * 이름 : 이해빈
 * 내용 : this로 다른 생성자 호출하기 P172, this를 사용하여 주소 값 반환하기 P173
 */

class Person {
	
	String name;
	int age;

	Person() { // Person() 디폴트 생성자가 호출되는 경우에 초깃값으로 나오게 됨
		this("이름 없음", 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}


public class CallAnotherConst {
	public static void main(String[] args) {
		
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}
