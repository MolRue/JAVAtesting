package CH08.Dice;

import java.util.Random;

public class DiceNO2 implements Dice{
	Random random = new Random();	
	
	@Override
	public void diceNum() {
		System.out.println(random.nextInt(6));
	}
}
