package ch06.P182;

/*
 * 날짜 : 2022/09/20
 * 이름 : 이해빈
 * 내용 : static 변수 사용하기 P182
 */

public class Student {
	
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
}
