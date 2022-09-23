package ch08.P262;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈
 * 내용 : 배열을 활용한 고객 관리 프로그램 구현하기
 */
public class CustomerTest {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010,"이순신");
		Customer customerShin = new Customer(10020,"신사임당");
		Customer customerHong = new Customer(10030,"홍길동");
		Customer customerYoul = new Customer(10040,"이율곡");
		Customer customerKim = new VIPCustomer(10050,"김유신",12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
	
		System.out.println("===== 고객 정보 출력 =====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		for(Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
			
		}
	}
}
