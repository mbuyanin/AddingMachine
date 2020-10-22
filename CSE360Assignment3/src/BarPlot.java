/**
 * @author Michael Buyanin
 * ID: 1215804811
 * Assignment: #3
 * 
 * The purpose of this file is to draw the BarPlot graph
 * 
 */

import java.awt.*;

public class BarPlot extends DecoratedPlot
{
	/**
	 * @param	g		Draws a BarPlot on a PlotPanel.
	 */
	public void draw(Graphics g)
	{
		g.setColor(Color.magenta);
		super.draw(g);
		
		for(int i = 0; i < 20 && i < values.size(); i++)
		{
			g.setColor(Color.red);
			g.fillRect(ARRAY_OF_POSITIONS[i], values.get(i), 4, 333-values.get(i));
		}
	}
}
