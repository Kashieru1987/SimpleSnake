package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import java.awt.Container;

import javax.swing.Box;
import javax.swing.JScrollPane;

import xyz.chronoziel.SimpleSnake.SnakeEngine.util.CustomButton;

@SuppressWarnings("serial")
public class OptionScrollPane extends JScrollPane {

	public OptionScrollPane() {
		Container mainContainer = Box.createVerticalBox();

		// create maxwidthbutton subclass to make all new buttons max width and nonfocusable

		mainContainer.add(new CustomButton("e")); //TEMP
		mainContainer.add(new CustomButton("e")); //TEMP
		mainContainer.add(new CustomButton("e")); //TEMP
		mainContainer.add(new CustomButton("e")); //TEMP

		this.setViewportView(mainContainer);

	}

}
