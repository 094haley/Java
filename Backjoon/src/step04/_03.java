package step04;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이해빈
 * 내용 : 백준 4단계 3번 문제. 나머지
 */

import java.io.*;

public class _03 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int [] arr = new int [10];
		int count = 1;
		
		for(int i = 0; i < 10; i ++) {
			
			int a = Integer.parseInt(br.readLine());
			arr[i] = a % 42;
		}
		
		for(int i = 0; i < 10; i ++) {
			
			for(int j = 0; j < 10; j ++) {
				
				if (arr[i] == arr[j]) {
					
				}
				
			}
		}
		
		System.out.println(count);
	}
}
