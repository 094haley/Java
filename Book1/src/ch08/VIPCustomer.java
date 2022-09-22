package ch08;

/*
 * 날짜 : 2022/09/22
 * 이름 : 이해빈
 * 내용 : VIPCustomer 클래스 구현하기 P237
 */
public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
//	public VIPCustomer () {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//	// 하위 클래스 생성할 때 콘솔 출력문
//	System.out.println("VIPCustomer() 생성자 호출");
	
	
	// 명시적으로 상위 클래스 생성자 호출하기 P245
	public VIPCustomer(int customerID, String customerName, int agentID) {
	
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VIPCustomer(int, String) 셍성자 호출");
		
	}
	
	
	public int getAgentID() {
		return agentID;
	}
}