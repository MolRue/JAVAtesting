package CH08.Dice;

import java.util.Random;

public class DiceNO2 implements Dice{
	Random random = new Random();	
	
	@Override
	public int diceNum() {
		int diceB = random.nextInt(8)+1;
		System.out.println(diceB);
		return diceB;
	}
}
