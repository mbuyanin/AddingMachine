/**
 * @author Michael Buyanin
 * ID: 1215804811
 * Assignment: #3
 * 
 * The purpose of this file is to be the main container of the program. This will run all the dependent files.
 * 
 */

import java.awt.*;
import java.util.*;
import javax.swing.JPanel;


public class PlotPanel extends JPanel implements Observer
{
	Drawable drawable;
	
	public PlotPanel(Drawable drawable)
	{
		this.drawable = drawable;
	}
	
	public void update(Observable o, Object arg)
	{
		drawable.setValue(((Source)o).getValue());
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{		
		if(drawable != null)
		{
			drawable.draw(g);
		}
	}
}
