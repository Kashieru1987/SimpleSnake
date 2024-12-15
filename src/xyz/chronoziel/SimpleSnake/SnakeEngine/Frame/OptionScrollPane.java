package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import java.awt.Container;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class OptionScrollPane extends JScrollPane {

	public OptionScrollPane() {

		Container mainContainer = Box.createVerticalBox();

		mainContainer.add(new JButton("e"));
		mainContainer.add(new JButton("e"));
		mainContainer.add(new JButton("e"));
		mainContainer.add(new JButton("e"));

		this.setViewportView(mainContainer);

	}

}
