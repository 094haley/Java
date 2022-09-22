package ch07.P227;

/*
 * 날짜 : 2022/09/22
 * 이름 : 이해빈
 * 내용 : 학생 성적 출력하기 P229
 */
public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("==============================");
		studentKim.showStudentInfo();
		
	}
}
