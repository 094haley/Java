package ch10.P340;

/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : BookShelf 테스트하기 P342
 */
public class BookShelfTest {
	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
	}
}
