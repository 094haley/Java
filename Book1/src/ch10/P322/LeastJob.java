package ch10.P322;

/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : 짧은 대기열 먼저 배분하기 P323 
 */
public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당됩니다.");
	}
	
}
