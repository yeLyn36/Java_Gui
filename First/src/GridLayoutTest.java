import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("새로운 창");
		
		JPanel panel = new JPanel();
		GridLayout gl = new GridLayout(2, 5); //2행 5열
		panel.setLayout(gl);
		//TODO: 창 내용 배치
		
		JButton btn;
		for (int i = 0; i < 10; i++) {
			btn = new JButton("BUTTON" + (i+1));
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
