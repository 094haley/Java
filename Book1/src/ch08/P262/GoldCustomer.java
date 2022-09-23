package ch08.P262;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈
 * 내용 : 새로운 고객 등급 추가하기 P267
 */
public class GoldCustomer extends Customer {

	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * saleRatio);
	}
}
