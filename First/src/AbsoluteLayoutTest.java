import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsoluteLayoutTest {
	public static void main(String[] args) {
JFrame frame = new JFrame("새로운 창");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		//TODO: 창 내용 배치
		
		JButton btn;
		for (int i = 0; i < 10; i++) {
			btn = new JButton("BUTTON" + (i+1));
			btn.setBounds(50*i, 30*i, 100, 100);
			panel.add(btn);
		}
		
		
		Dimension dim = new Dimension(500, 300);
		frame.setPreferredSize(dim);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
