package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import java.awt.Container;

import javax.swing.Box;
import javax.swing.JScrollPane;

import xyz.chronoziel.SimpleSnake.SnakeEngine.util.CustomButton;
import xyz.chronoziel.SimpleSnake.SnakeEngine.util.CustomLabelledTextField;

@SuppressWarnings("serial")
public class OptionScrollPane extends JScrollPane {

	public OptionScrollPane() {

		Container mainContainer = Box.createVerticalBox();

		mainContainer.add(new CustomButton("Reset Snake", actionevent -> {
			//code to reset snake here
		}));

		mainContainer.add(Box.createVerticalStrut(10));

		mainContainer.add(new CustomLabelledTextField("Apple Count: ", actionevent -> {
			//code to set apple count here
		}));

		this.setViewportView(mainContainer);

	}

}
