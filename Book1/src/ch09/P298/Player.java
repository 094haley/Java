package ch09.P298;

/*
 * 날짜 : 2022/09/23
 * 이름 : 이해빈 
 * 내용 : Player 클래스 구현하기 P298
 */
public class Player {
	
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
