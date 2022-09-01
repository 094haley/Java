package ch05;

public class Pizza1 {
	
	private String toppings;
	private int radius;
	static final double PI = 3.141592; // 상수정의
	static int count = 0; // 정적필드
	
	public Pizza1(String toppings) {
		this.toppings = toppings;
		count++;
	}
}
