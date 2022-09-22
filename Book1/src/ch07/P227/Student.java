package ch07.P227;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/22
 * 이름 : 이해빈
 * 내용 : Student 클래스 구현하기 P227
 */
public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList 선언하기
	
	public Student(int studentID, String studentName) {
		
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // ArrayList 생성하기
		
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject); 
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + "과목 성적은 " + s.getScorePoint() +"입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
}
