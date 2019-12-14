package ver1;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {
	
	public static final int SCREEN_WIDTH = 320;
	public static final int SCREEN_HEIGHT = 620;
	
	private static Image IconImage = new ImageIcon(Main.class.getResource("../Images/icon.png")).getImage();
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("To-do");
		JPanel panel = new JPanel();
		JTextArea textarea = new JTextArea("", 1, 20);
		JButton btn1 = new JButton("okay");
		
		
		panel.add(textarea);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JLabel text = new JLabel("test");
				panel.add(text);
			}
		});
		panel.add(btn1);
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setIconImage(IconImage);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
