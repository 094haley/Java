package ch04;

/*
 * 날짜 : 2022/08/30
 * 이름 : 이해빈
 * 내용 : 생성자 만들어보기
 */



public class TelevisionTest {
	public static void main(String[] args) {
		
		Television myTv = new Television(7, 10, true);
		myTv.print();
		
		Television yourTv = new Television(11, 20, true);
		yourTv.print();
		
	}
}
