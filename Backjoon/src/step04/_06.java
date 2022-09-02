package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이해빈
 * 내용 : 백준 4단계 6번 문제. 평균은 넘겠지
 */

public class _06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < c; i ++) {
			
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken()); // 학생수
		int arr[] = new int[n];
		int tot = 0;
		int count =0;
		
			for(int j = 0; j < n ; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				tot += arr[j];
			} // 배열 완성
			
			for(int j = 0; j < n; j++) {
				if(arr[j] > tot/n) {
					count++;
				}
			}// 평균넘는 학생수 구하기
			
		double r = (double)count/n*100;
		sb.append(String.format("%.3f", r)).append("%").append("\n");
		}
	System.out.println(sb);
	}
}
