package ch08.P262;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈
 * 내용 : 고객 관리 프로그램 완성하기 P263
 */
public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	// calcPrice() 메서드 재정의하기 P250
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * saleRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() +" 담당 상담원 번호는 " + agentID + "입니다";
	}
	
}
