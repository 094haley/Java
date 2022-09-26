package ch11;

/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : Object 클래스의 toString() 메서드 사용하기 P354
 */

class Book {
	
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// toString() 메서드 재정의하기 P356
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}


public class ToStringEx {
	public static void main(String[] args) {
		
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString()); // toString() 메서드로 인스턴스 정보를 보여줌
	}
}
