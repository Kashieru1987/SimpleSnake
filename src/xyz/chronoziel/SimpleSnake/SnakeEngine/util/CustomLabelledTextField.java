package xyz.chronoziel.SimpleSnake.SnakeEngine.util;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CustomLabelledTextField extends Container {

	private JLabel internalLabel;
	private JTextField internalTextField;

	public CustomLabelledTextField(String text) {
		this(text, null);
	}

	public CustomLabelledTextField(String text, ActionListener actionListener) {
		internalLabel = new JLabel(text);
		internalTextField = new JTextField();

		if(actionListener != null) {
			internalTextField.addActionListener(actionListener);
		}


		this.add(internalLabel);
		this.add(internalTextField);

		this.init();
	}

	public void init() {
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setMaximumSize(new Dimension(Integer.MAX_VALUE, this.getMinimumSize().height));
	}

	public JLabel getLabel() {
		return this.internalLabel;
	}

	public JTextField getTextField() {
		return this.internalTextField;
	}

}
