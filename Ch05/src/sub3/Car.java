package sub3;

public class Car {
	
	// 속성 - 클래스 속성을 private 선언하는것이 좋다
	private String name;
	private String color;
	private int speed;
	public static int count; // Car객체들이 공유하는 변수
	
	// 생성자 - 초기화를 위해 생성자를 만듦
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	
	// Getter, Setter - 속성에 대한 안전한 접근을 위함
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	// 기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("현재속도 : "+speed);

	}
	
		
	
}
