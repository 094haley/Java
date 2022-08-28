package step03;

/* 
 * 날짜 : 2022/08/27
 * 이름 : 이해빈
 * 내용 : 백준 3단계 6번 문제. A + B - 7
 */

import java.io.*;
import java.util.StringTokenizer;
import java.io.IOException;

public class _06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 1; i <= t; i ++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + i +": " + (a+b) +"\n");
			
		}
		bw.close();
	}
}
