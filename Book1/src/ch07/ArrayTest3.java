package ch07;

/*
 * 날짜 : 2022/09/21
 * 이름 : 이해빈
 * 내용 : 배열의 유효한 요소 값 출력하기 P205
 */

public class ArrayTest3 {
	public static void main(String[] args) {
		
		double[] data = new double[5];
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		for(int i = 0; i < size; i++) { // 유효한 값이 저장된 배열 요소 개수만큼 반복문 실행
			System.out.println(data[i]);
		}
	}
}
