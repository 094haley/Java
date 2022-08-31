package step04;

/*
 * 날짜 : 2022/08/31
 * 이름 : 이해빈
 * 내용 : 백준 4단계 3번 문제. 나머지
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _03 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int [] arr = new int [10];
		int count = 0;
		
		for(int i = 0; i < 10; i ++) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a % 42;
		}
		
		for(int i = 0; i < 10; i ++) {
			int b = 0;
			for(int j = i+1; j < 10; j ++) {
				if (arr[i] == arr[j]) {
					b++;
				}
			}
			if(b == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
