package ch03;

import java.util.Arrays;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이해빈
 * 내용 : 래그드 배열
 */

public class P120 {
	public static void main(String[] args) {
		
		int [][] rarry = new int [3][];
		rarry[0] = new int [] {1, 2, 3, 4};
		rarry[1] = new int [] {5, 6, 7};
		rarry[2] = new int [] {8, 9};
		
		for (int[] row: rarry) {
			
			System.out.println(Arrays.toString(row));
		}
		
	}
}
