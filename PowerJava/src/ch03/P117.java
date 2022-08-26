package ch03;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이해빈
 * 내용 : 정확한 입력받기
 */
public class P117 {
	public static void main(String[] args) {
		
		int [][] seats = {{0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
						  {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
						  {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}};
		
		int count = 0;
		for (int i = 0; i < seats.length; i ++) {
			for (int k = 0; k < seats[i].length; k ++) {
				count += seats[i][k];
			}
		}
		
		System.out.println("현재 관객 수는 "+count+"명입니다.");
	}
}
