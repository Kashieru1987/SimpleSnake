package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import java.awt.Container;

import javax.swing.Box;
import javax.swing.JScrollPane;

import xyz.chronoziel.SimpleSnake.SnakeEngine.util.CustomButton;

@SuppressWarnings("serial")
public class OptionScrollPane extends JScrollPane {

	public OptionScrollPane() {
		Container mainContainer = Box.createVerticalBox();

		mainContainer.add(new CustomButton("Reset Snake", actionevent -> {
			//code to reset snake here
		}));



		this.setViewportView(mainContainer);

	}

}
