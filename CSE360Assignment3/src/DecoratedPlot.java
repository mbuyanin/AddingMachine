/**
 * @author Michael Buyanin
 * ID: 1215804811
 * Assignment: #3
 * 
 * The purpose of this file is to be simplify the code in MarkedPlot.java and BarPlot.java. 
 * 
 */

import java.awt.*;

public abstract class DecoratedPlot extends Drawable
{
	public void add(Drawable d) {} // I was told to create this in the UML diagram, but I don't see why.
	
	public void setValue(int value)
	{
		super.setValue(value);
	}
	
	//Since Marked and Bar plots require "points", I decided it would be best to establish them here so I would not have to worry about them later.
	public void draw(Graphics g)
	{
		super.draw(g);
		
		for(int i = 0; i < values.size(); i++)
		{
			g.fillRect(ARRAY_OF_POSITIONS[i], values.get(i), 5, 5);
		}
	}
}