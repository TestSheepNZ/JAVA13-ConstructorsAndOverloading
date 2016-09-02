package diceGames;

import org.junit.Test;
import static org.junit.Assert.*;
 
import java.util.ArrayList;
import java.util.Arrays;

public class testClass {

	
	@Test
	public void testD20()
	{
		diceClass dice1 = new diceClass(20);
		
		for (int count=0 ; count < 20 ; count ++)
			dice1.rollDice();
		
	}
	
	@Test
	public void testDefault()
	{
		diceClass dice1 = new diceClass();
		
		for (int count=0 ; count < 20 ; count ++)
			dice1.rollDice();
		
	}
	
}
