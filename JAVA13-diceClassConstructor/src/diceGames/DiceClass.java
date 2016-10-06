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

public class DiceClass {

	//Attributes
	private int numSides;
	private int diceRollValue;
	
	//Constructors
	
	public DiceClass(int sides)
	{
		System.out.println("BASE CLASS: CONSTRUCTOR called with sides of " + sides);
		this.numSides = sides;
	}
	
	public DiceClass()
	{
		this(6);
	}
	
	//Methods

	
	public int rollDice ()
	{
		diceRollValue = 1 + (int)(Math.random() * numSides);
		
		System.out.println("BASE CLASS: Rolled the number " + diceRollValue);
		return this.diceRollValue;
	}
	
	
	public void setNumSides (int sides)
	{
		System.out.println("BASE CLASS: Set number of sides as " + sides);
		this.numSides = sides;
	}
	
	public int getDiceValue ()
	{
		return diceRollValue;
	}
	
	public boolean diceOnOrUnder (int threshold)
	{
		if (diceRollValue >= threshold)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean diceOnOrOver (int threshold)
	{
		if (diceRollValue >= threshold)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean diceEquals (int target)
	{
		if (diceRollValue == target)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	

}
