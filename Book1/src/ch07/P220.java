package ch07;

/*
 * 날짜 : 2022/09/22
 * 이름 : 이해빈
 * 내용 : 이차원 배열 초기화하기
 */
public class P220 {
	public static void main(String[] args) {
		
		int[][] arr = {{1, 2, 3},{4, 5, 6}};
		
		for(int i = 0; i < arr.length; i++) {  // arr.length - 행의 길이
			for(int j = 0; j < arr[i].length; j++) { //arr[i].length - 열의 길이
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}
}
