package ch10.P340;

/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : BookShelf 클래스 구현하기 P341
 */
public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
	
	
	
}
