package step01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 이해빈
 * 내용 : 백준 1단계 10번 문제. 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
import java.util.Scanner;
public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		System.out.print(1-a+" ");
		System.out.print(1-b+" ");
		System.out.print(2-c+" ");
		System.out.print(2-d+" ");
		System.out.print(2-e+" ");
		System.out.print(8-f+" ");
		
		sc.close();
	}
}
