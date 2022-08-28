package step04;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이해빈
 * 내용 : 백준 4단계 2번 문제. 최댓값
 */

import java.util.*;

public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[9];
		
		for(int i = 0; i < 9; i ++) {
			int a = sc.nextInt();
			arr[i] = a;
		} 
		
		int max = arr[0];
		int b = 0;
		for (int i =0; i < 9; i ++) {
			if (max < arr[i]) {
				max = arr[i];
				b = i; // 여기서 i+1을 하게되면 첫번째값이 제일 클 때 b는 초기값인 0이 되어버린다.
			}
		}
		
		System.out.println(max);
		System.out.println(b+1);
		
	}
	
	
}
// *BufferedReader를 이용한 풀이
//
//import java.util.*;
//import java.io.*;
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int [] arr = new int[9];
//		
//		for(int i = 0; i < 9; i ++) {
//			int a = Integer.parseInt(br.readLine()); // 라인단위로 받기 때문에 스트링토크나이저 필요가 없다
//			arr[i] = a;
//		} 
//		
//		int max = arr[0];
//		int b = 0;
//		for (int i =0; i < 9; i ++) {
//			if (max < arr[i]) {
//				max = arr[i];
//				b = i;
//			}
//		}
//		
//		System.out.println(max);
//		System.out.println(b+1);
//		
//	}