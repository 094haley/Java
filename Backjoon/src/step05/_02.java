package step05;

/*
 * 날짜 : 2022/10/01
 * 이름 : 이해빈
 * 내용 : 백준 5단계 2번 문제. 셀프 넘버.
 */

public class _02 {
	public static void main(String[] args) {
		
		boolean[] a = new boolean [10001];
		
		for(int i = 1; i <= 10000; i++) {
			int n = d(i);
			
			if(n <= 10000) {
				a[n] = true;
			}
		}
		
		for(int i = 1; i <=10000; i++ ) {
			if(a[i] == false) {
				System.out.println(i); 
				 
			}
		}
	}
	
	public static int d(int num) {
		
		int sum = num;
		while(num != 0) {
			sum += num % 10;
			num = num/10;
		}
		return sum;
	}
}
