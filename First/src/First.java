import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class First {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("기본값");
		label.setText("잘 가");
		
		JLabel label2 = new JLabel();
		label2.setText("가지마");
		
		frame.add(panel);
		panel.add(label);
		panel.add(label2);
		panel.add(label2);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
