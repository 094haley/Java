package step04;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이해빈
 * 내용 : 백준 4단계 1번 문제. 최소, 최대
 */


import java.util.*;

public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		
		for (int i = 0; i < n ; i ++) {
			int a = sc.nextInt();
			arr[i] = a;	
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < n ; i ++) {
			
			if (max < arr[i]) {
				max = arr[i];
			}
			
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min + " " + max);
	}
}
