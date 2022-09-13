package ch05;

/* 
 * 날짜 : 2022/09/09
 * 이름 : 이해빈
 * 내용 : 학생 클래스 만들기 P129
 * 		
 */

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	// 학생 이름과 주소 출력하는 메서드 만들기 P132
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
}
