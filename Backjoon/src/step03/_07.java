package step03;

/*
 * 날짜 : 2022/08/27
 * 이름 : 이해빈
 * 내용 : 백준 3단계 7번 문제. A + B - 8
 */

import java.io.*;
import java.util.StringTokenizer;

public class _07 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= t; i ++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a+b) + "\n");
			
		}
		bw.flush();
	}
}
