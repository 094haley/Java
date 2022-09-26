package ch10.P322;

/*
 * 날짜 : 2022/09/24
 * 이름 : 이해빈
 * 내용 : Scheduler 인터페이스 정의하기 P322
 */
public interface Scheduler {
	
	public void getNextCall();
	public void sendCallToAgent();
}
