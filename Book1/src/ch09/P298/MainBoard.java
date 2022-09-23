package ch09.P298;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈 
 * 내용 : 테스트 프로그램 실행하기 P303
 */

public class MainBoard {
	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}
}
