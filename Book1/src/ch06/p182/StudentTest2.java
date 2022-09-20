package ch06.p182;

/*
 * 날짜 : 2022/09/20
 * 이름 : 이해빈
 * 내용 : 학번 확인하기 P185
 */
public class StudentTest2 {
	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);
		
	}
}
