package ch08.P234;

/*
 * 날짜 : 2022/09/22
 * 이름 : 이해빈
 * 내용 : 하위 클래스 생성하기 P242
 */

public class CustomerTest2 {
	public static void main(String[] args) {
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신",11111); // 하위 클래스 생성
//		customerKim.setCustomerID(10020);
//		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}
}
