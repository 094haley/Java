package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이해빈
 * 내용 : 백준 4단계 5번 문제. OX퀴즈
 */

public class _05 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i ++) {
			String str = br.readLine();
			int l = str.length();
			String[] strArray = str.split("");
			int tot = 0;
			for(int j = 0; j < l; j ++) {
				
				switch (strArray[j]) {
				case 'O'
				
				
				}
			}
			System.out.println(tot);
		}
	}
}
