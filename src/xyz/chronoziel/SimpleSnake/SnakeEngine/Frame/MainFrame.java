package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import xyz.chronoziel.SimpleSnake.SnakeEngine.EngineConfig;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	public MainFrame() {
		this.init();

		this.add(this.createSplitPane());
	}

	public void init() {
		this.setVisible(true); //needs to be visible for calculations, such as insets

		this.setTitle(EngineConfig.TITLE);
		this.setSize(EngineConfig.SIZE);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);
	}

	@Override
	public void setSize(Dimension inputSize) {
		Insets insets = this.getInsets();
		final int width = inputSize.width + insets.left + insets.right;
		final int height = inputSize.height + insets.top + insets.bottom;

		super.setSize(width, height);
	}

	public JSplitPane createSplitPane() {
		GamePanel gamePanel = new GamePanel(new Painter().getPaintList());
		OptionScrollPane optionScrollPane = new OptionScrollPane();

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, gamePanel, optionScrollPane);
		splitPane.setDividerLocation(EngineConfig.GAME_PANEL_WIDTH);
		splitPane.setEnabled(false);
		return splitPane;
	}

}
