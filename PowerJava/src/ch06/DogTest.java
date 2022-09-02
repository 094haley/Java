package ch06;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이해빈
 * 내용 : Animal 클래스와 Dog 클래스 만들어보기
 */

class Animal {
	int age;
	void eat () {
		System.out.println("먹고 있음...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("짖고 있음...");
	}
}

public class DogTest {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}
