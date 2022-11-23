package CH08.Dice;

import java.util.Random;

public class DiceNO1 implements Dice{
	Random random = new Random();
	
	@Override
	public int diceNum() {
		int diceA = random.nextInt(6)+1;
		System.out.println(diceA);
		return diceA;
	}

}
