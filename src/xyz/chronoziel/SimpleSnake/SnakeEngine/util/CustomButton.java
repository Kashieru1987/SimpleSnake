package xyz.chronoziel.SimpleSnake.SnakeEngine.util;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class CustomButton extends JButton {

	public CustomButton(String text) {
		this(text, null);
	}

	public CustomButton(String text, ActionListener actionListener) {
		this.setText(text);

		if(actionListener != null) {
			this.addActionListener(actionListener);
		}

		this.initCustomButton();
	}

	public void initCustomButton() {
		this.setFocusable(false);
		this.setMaximumSize(new Dimension(Integer.MAX_VALUE, this.getMaximumSize().height));
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
	}

}
