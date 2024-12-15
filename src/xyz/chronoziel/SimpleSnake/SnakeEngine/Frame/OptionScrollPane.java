package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import java.awt.Container;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class OptionScrollPane extends JScrollPane {

	public OptionScrollPane() {
		Container mainContainer = Box.createVerticalBox();

		// create maxwidthbutton subclass to make all new buttons max width and nonfocusable

		mainContainer.add(new JButton("e")); //TEMP
		mainContainer.add(new JButton("e")); //TEMP
		mainContainer.add(new JButton("e")); //TEMP
		mainContainer.add(new JButton("e")); //TEMP

		this.setViewportView(mainContainer);

	}

}
