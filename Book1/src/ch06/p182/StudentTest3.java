package ch06.p182;

/*
 * 날짜 : 2022/09/20
 * 이름 : 이해빈
 * 내용 : 클래스 이름으로 static 변수 참조하기 P186
 * 		- static 변수는 클래스 이름으로 직점 참조한다
 */
public class StudentTest3 {
	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
		
		
	}
}
