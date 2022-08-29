package sub3;

public class Calc {
	
	private static Calc instance = new Calc(); // 클래스 자기자신이 객체 생성 
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {} // private 생성자. Calc의 생성자를 호출 못하게 됨 
	
	
	
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) {
		return x/y;
	}
}
