package step05;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이해빈
 * 내용 : 백준 5단계 1번 문제. 정수 N개의 합
 */

public class _01 {

	    long sum(int[] a) {
	        long ans = 0;
	        for(int i = 0; i < a.length; i ++){
	            ans += a[i];
	        }
	        return ans;
	    }
}
