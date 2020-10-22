/**
 * @author Michael Buyanin
 * ID: 1215804811
 * Assignment: #3
 * 
 * The purpose of this file is to be the main container of the program. This will run all the dependent files.
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.Timer;


public class World extends JFrame implements ActionListener
{
	Source source = new Source();
	
	public World()
	{
		BarPlot    plotBar    = new BarPlot();
		MarkedPlot plotMarked = new MarkedPlot();
		SimplePlot plotSimple = new SimplePlot();
		
		PlotPanel panelBar    = new PlotPanel(plotBar);
		PlotPanel panelMarked = new PlotPanel(plotMarked);
		PlotPanel panelSimple = new PlotPanel(plotSimple);
		
		source.addObserver(panelBar);
		source.addObserver(panelMarked);
		source.addObserver(panelSimple);
		
		JButton button = new JButton("RUN");
		button.setSize(new Dimension(5,2));
		button.setFocusPainted(false); // This will make the box look more professional
		button.addActionListener(this);
		
		panelBar.setPreferredSize(new Dimension(500, 333));
		panelMarked.setPreferredSize(new Dimension(500, 333));
		panelSimple.setPreferredSize(new Dimension(500, 333));
		
		setLayout(new FlowLayout()); // FlowLayout will help simplify my layout.
		
		add(panelBar);
		add(panelMarked);
		add(panelSimple);
		add(button);
	}
	
	public static void main(String[] args) 
	{
		World world = new World();
		world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		world.setSize(500,1100);
		world.setVisible(true);
	}

	/**
	 * @param e	Reads an event, which in this case will be whenever the button RUN is pressed.
	 */
	public void actionPerformed(ActionEvent e)
	{
		source.create();
		repaint();
	}
}