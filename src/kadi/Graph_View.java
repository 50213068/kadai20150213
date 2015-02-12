package kadi;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph_View extends Frame implements ActionListener,WindowListener{
	
	public Graph_View() {
		// TODO Auto-generated method stub
		addWindowListener(this);
		setTitle("Graph");	
		
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		
	
		data.addValue(10.1, "Average maximum temperature", "JAN");
		data.addValue(11.1, "Average maximum temperature", "FEB");
		data.addValue(14.3, "Average maximum temperature", "MAR");
		data.addValue(19.3, "Average maximum temperature", "APR");
		data.addValue(23.0, "Average maximum temperature", "MAY");
		data.addValue(25.8, "Average maximum temperature", "JUN");
		data.addValue(29.4, "Average maximum temperature", "JULY");
		data.addValue(31.1, "Average maximum temperature", "AUG");
		data.addValue(28.2, "Average maximum temperature", "SEPT");
		data.addValue(23.1, "Average maximum temperature", "OCT");
		data.addValue(17.9, "Average maximum temperature", "NOV");
		data.addValue(12.7, "Average maximum temperature", "DEC");

		data.addValue(2.5, "Average minimum temperature", "JAN");
		data.addValue(2.7, "Average minimum temperature", "FEB");
		data.addValue(5.6, "Average minimum temperature", "MAR");
		data.addValue(10.4, "Average minimum temperature", "APR");
		data.addValue(14.9, "Average minimum temperature", "MAY");
		data.addValue(19.0, "Average minimum temperature", "JUN");
		data.addValue(23.0, "Average minimum temperature", "JULY");
		data.addValue(24.0, "Average minimum temperature", "AUG");
		data.addValue(21.0, "Average minimum temperature", "SEPT");
		data.addValue(15.3, "Average minimum temperature", "OCT");
		data.addValue(9.8, "Average minimum temperature", "NOV");
		data.addValue(4.8, "Average minimum temperature", "DEC");
		
		data.addValue(5.9, "Average temperature", "JAN");
		data.addValue(6.5, "Average temperature", "FEB");
		data.addValue(9.7, "Average temperature", "MAR");
		data.addValue(14.7, "Average temperature", "APR");
		data.addValue(18.7, "Average temperature", "MAY");
		data.addValue(22.0, "Average temperature", "JUN");
		data.addValue(25.7, "Average temperature", "JULY");
		data.addValue(27.0, "Average temperature", "AUG");
		data.addValue(24.1, "Average temperature", "SEPT");
		data.addValue(18.8, "Average temperature", "OCT");
		data.addValue(13.5, "Average temperature", "NOV");
		data.addValue(8.4, "Average temperature", "DEC");
		
	    JFreeChart chart = 
	      ChartFactory.createLineChart("Temperature Hamamatsu city",
	    		  					   "month",
	    		  					   "temperature(℃)",
	                                   data,
	                                   PlotOrientation.VERTICAL,
	                                   true,
	                                   false,
	                                   false);

	    ChartPanel cpanel = new ChartPanel(chart);
	    add(cpanel, BorderLayout.CENTER);

	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
