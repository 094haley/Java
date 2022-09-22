package ch08;

/*
 * 날짜 : 2022/09/22
 * 이름 : 이해빈
 * 내용 : Customer 클래스 구현하기 P234
 */
public class Customer {
	
	// 상속을 위해 protected로 선언
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	
	int bonusPoint;
	double bonusRatio;
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//		// 상위 클래스 생성할 때 콘솔 출력문
//		System.out.println("Customer() 생성자 호출");
//	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	
	// protected로 선언한 변수를 외부에서 사용할 수 있도록 get, set 메서드
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	// Customer 클래스에 새로운 생성자 추가하기 P245
	public Customer(int customerID, String customerName) {
		
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
}
