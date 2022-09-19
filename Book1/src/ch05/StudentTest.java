package ch05;

/* 
 * 날짜 : 2022/09/19
 * 이름 : 이해빈
 * 내용 : StudentTest 실행 클래스 만들기 P146
 */
public class StudentTest {

	public static void main(String[] args) {
		
		Student studentAhn = new Student();
		
		//studentAhn.studentName = "안승연";
	
		//System.out.println(studentAhn.studentName);
		//System.out.println(studentAhn.getStudentName());
		

		// private 변수에 접근하기 P165
		Student studentLee = new Student();
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
		
	}
}
