package step04;

/*
 * 날짜 : 2022/09/01
 * 이름 : 이해빈
 * 내용 : 백준 4단계 5번 문제. OX퀴즈
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < n; i ++) {
			
			String str = br.readLine();
			int l = str.length();
			char[] charArray = str.toCharArray();
			int tot = 0;
			int a = 0;
			
			for(int j = 0; j < l; j ++) {
				
				switch (charArray[j]) {
				case 'O':
					a++;
					tot = tot+a;
					break; // O이면 a값을 더해줌
					
				case 'X':
					a = 0;
					break; // X가 나오면 a값을 초기화
				}
				
			}
			sb.append(tot).append("\n");
		}
		System.out.println(sb);
	}
}
