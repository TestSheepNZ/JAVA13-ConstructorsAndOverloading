package diceGames;

/*
 * This program is part of my learning Java series
 * This one looks at an constructors and overloading
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/09/java-13-constructors-and-overloading.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Sept 2016
 */

import org.junit.Test;
import static org.junit.Assert.*;
 
import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {

	
	@Test
	public void testD20()
	{
		DiceClass dice1 = new DiceClass(20);
		
		for (int count=0 ; count < 20 ; count ++)
			dice1.rollDice();		
	}
	
	@Test
	public void testDefault()
	{
		DiceClass dice1 = new DiceClass();
		
		for (int count=0 ; count < 20 ; count ++)
			dice1.rollDice();
		
	}
	
}
