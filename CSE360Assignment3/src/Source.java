/**
 * @author Michael Buyanin
 * ID: 1215804811
 * Assignment: #3
 * 
 * The purpose of this file is to create a value and then tell the plots that a new value has been created and has to be added to a linked list.
 * 
 */

import java.util.Observable;
import java.util.Random;

public class Source extends Observable
{
	private int value;
	
	public void create()
	{
		value = new Random().nextInt(251);
		setChanged();
		notifyObservers();
	}
	
	public int getValue()
	{
		return value;
	}
}