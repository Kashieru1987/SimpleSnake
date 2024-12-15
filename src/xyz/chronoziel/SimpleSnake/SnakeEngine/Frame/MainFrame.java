package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import xyz.chronoziel.SimpleSnake.SnakeEngine.EngineConfig;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5533038637139609033L;

	public MainFrame() {
		this.init();


		GamePanel gamePanel = new GamePanel(new Painter().getPaintList());
		OptionScrollPane optionScrollPane = new OptionScrollPane();

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, gamePanel, optionScrollPane);
		splitPane.setDividerLocation(600);
		splitPane.setEnabled(false);

		this.add(splitPane);
	}

	public void init() {
		this.setTitle(EngineConfig.TITLE);
		this.setSize(EngineConfig.SIZE);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
