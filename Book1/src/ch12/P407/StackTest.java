package ch12.P407;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/26
 * 이름 : 이해빈
 * 내용 : 스택 구현하기 P419
 */

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return(arrayStack.remove(len-1)); // 맨 뒤에 있는 자료 반환하고 배열에서 제거
	}
}

public class StackTest {
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
