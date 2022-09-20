package ch06.p182;

/*
 * 날짜 : 2022/09/20
 * 이름 : 이해빈
 * 내용 : serialNum의 get(), set() 메서드 사용하기 P187
 */

public class Student2 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	public void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
}
