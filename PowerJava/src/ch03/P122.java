package ch03;

import java.util.ArrayList;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이해빈
 * 내용 : ArrayList 사용
 */
public class P122 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("철수");
		list.add("영희");
		list.add("순신");
		list.add("자영");
		
		for(String obj : list) {
			
			System.out.print(obj + " ");
		}
	}
}
