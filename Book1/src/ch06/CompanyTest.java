package ch06;

/*
 * 날짜 : 2022/09/21
 * 이름 : 이해빈
 * 내용 : 변수의 주소 값 비교하기 P196
 */
public class CompanyTest {
	public static void main(String[] args) {
		
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);
	}
}
