/**
 * @author Michael Buyanin
 * ID: 1215804811
 * Assignment: #3
 * 
 * The purpose of this file is to add values to a linked list. This would then be drawn.
 * 
 */

import java.awt.Graphics;
import java.util.LinkedList;

public abstract class Drawable 
{
	protected LinkedList<Integer> values = new LinkedList<Integer>();
	
	// I chose these numbers so the UI would not show the first and last number on the borders. This allows the graphs to be more readable.
	protected int[] ARRAY_OF_POSITIONS = {12, 37, 62, 87, 112, 137, 162, 187, 212, 237, 262, 287, 312, 337, 362, 387, 412, 437, 462, 487};
	
	public void setValue(int v)
	{
		// The maximum number of values allowed is 20. Removes the head of the linked list and adds a new value at the tail.
		if(values.size() >= 20)
		{
			values.removeFirst();
		}
		values.add(v);
	}
	
	/**
	 * 
	 * @param g		This is where the program will actually start drawing on the plot.
	 */
	public void draw(Graphics g)
	{
		for(int i = 1; i < values.size(); i++)
		{
			g.drawLine(ARRAY_OF_POSITIONS[i-1], values.get(i-1), ARRAY_OF_POSITIONS[i], values.get(i));
		}	
	}
}
