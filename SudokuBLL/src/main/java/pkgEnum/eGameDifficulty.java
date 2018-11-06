package pkgEnum;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	EASY(100), MEDIUM(500), HARD(1000);

	private int iDifficulty;
	
	eGameDifficulty(int iDifficulty) {
		this.iDifficulty=iDifficulty;
	}
	
	public static eGameDifficulty get(int iDifficulty) {
		eGameDifficulty eGDreturn = null;
		for (eGameDifficulty eGD: eGameDifficulty.values()) {
			if (eGD.iDifficulty <= iDifficulty) {
				eGDreturn=eGD;
			}
		}
		return eGDreturn;
		
	}
	
	public int getiDifficulty() {
		return iDifficulty;
	}
	
	private static Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();
	static {
		lookup.put(100, eGameDifficulty.EASY);
		lookup.put(500, eGameDifficulty.MEDIUM);
		lookup.put(1000, eGameDifficulty.HARD);
		}	
	}