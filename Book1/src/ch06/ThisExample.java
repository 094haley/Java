package ch06;

/*
 * 날짜 : 2022/09/19
 * 이름 : 이해빈
 * 내용 : this 출력하기 P170
 */

class BirthDay {
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample{
	public static void main(String[] args) {
	
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay); // 참조 변수 출력
		bDay.printThis(); // this 출력 메서드 호출
		
	}
}
