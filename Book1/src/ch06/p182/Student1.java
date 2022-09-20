package ch06.p182;

/*
 * 날짜 : 2022/09/20
 * 이름 : 이해빈
 * 내용 : 학번 자동으로 부여하기 P184
 */
public class Student1 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++; // 학생이 생성될 때마다 증가 
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
}
