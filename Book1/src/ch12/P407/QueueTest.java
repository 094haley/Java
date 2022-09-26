package ch12.P407;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/26
 * 이름 : 이해빈
 * 내용 : 큐 구현하기 P420
 */

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		return(arrayQueue.remove(0)); // 맨 앞의 자료 반환하고 배열에서 제거
	}
}

public class QueueTest {
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}
}
