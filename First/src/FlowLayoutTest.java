import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("새로운 창");
		Dimension dim = new Dimension(500, 300);
		frame.setPreferredSize(dim);
		
		JPanel panel = new JPanel();
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);
		panel.setLayout(fl);
		//TODO: 창 내용 배치
		
		JButton btn;
		for (int i = 0; i < 10; i++) {
			btn = new JButton("BUTTON" + (i+1));
			panel.add(btn);
		}
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
