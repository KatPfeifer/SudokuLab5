package pkgEnum;

import static org.junit.Assert.*;

import org.junit.Test;

public class eGameDifficultyTest {

	@Test
	public void GameDifficultyTest() {
		
		eGameDifficulty eGD = eGameDifficulty.get(0);
		assertNull(eGD);
		eGD=eGameDifficulty.get(100);
		assertEquals(eGameDifficulty.EASY, eGD);
		eGD=eGameDifficulty.get(499);
		assertEquals(eGameDifficulty.EASY, eGD);
		eGD=eGameDifficulty.get(500);
		assertEquals(eGameDifficulty.MEDIUM, eGD);
		eGD=eGameDifficulty.get(1000);
		assertEquals(eGameDifficulty.HARD, eGD);
		eGD=eGameDifficulty.get(1001);
		assertEquals(eGameDifficulty.HARD, eGD);
	}

}
