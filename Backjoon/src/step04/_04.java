package step04;

/*
 * 날짜 : 2022/08/31
 * 이름 : 이해빈
 * 내용 : 백준 4단계 4번 문제. 평균
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int [n];
		double tot=0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < n; i ++) {
			int a = Integer.parseInt(st.nextToken());
			arr1[i] = a;
			tot+= arr1[i];
		} 
		
		int m = arr1[0];
		for (int i = 0; i < n ; i ++) {
			if(m < arr1[i]) {
				m = arr1[i];
			}
		} 
		
		System.out.println(tot/m*100/n);
	}
}
