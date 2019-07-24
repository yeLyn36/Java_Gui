import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Counter {

	public static void main(String[] args) {
		JFrame frame = new JFrame("새로운 창");
		
		JPanel panel = new JPanel();
		JLabel lbId = new JLabel("아이디 : ");
		JTextField tfId = new JTextField(20);
		JLabel lbPwd = new JLabel("패스워드 : ");
		JTextField tfPwd = new JTextField(20);
		JLabel lbGender = new JLabel("성별 : ");
		JRadioButton rbFemale = new JRadioButton("여자");
		JRadioButton rbMale = new JRadioButton("남자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbFemale);
		bg.add(rbMale);
		JLabel lbMeal = new JLabel("식사 : ");
		JCheckBox cbChicken = new JCheckBox("치킨");
		JCheckBox cbPizza = new JCheckBox("피자");
		JLabel lbEdu = new JLabel("학력 : ");
		String[] edu = {"초등학교 졸업", "중학교 졸업"};
		JComboBox<String> cxEdu = new JComboBox<>(edu);
		cxEdu.addItem("고등학교 졸업");
		JButton bts = new JButton("아미");
		ImageIcon ii = new ImageIcon("src/images/signup.png");
		ImageIcon sii = new ImageIcon(ii.getImage().getScaledInstance(259/2, 194/2, Image.SCALE_DEFAULT));
		JLabel lbSignup = new JLabel(sii);
		ImageIcon food = new ImageIcon("src/images/ddeck.jpeg");
		JButton btFood = new JButton(food);
		ImageIcon Sfood = new ImageIcon(food.getImage().getScaledInstance(259/2, 194/2, Image.SCALE_DEFAULT));
		JButton btSfood = new JButton(Sfood);
		
		panel.add(lbId);
		panel.add(tfId);
		panel.add(lbPwd);
		panel.add(tfPwd);
		panel.add(lbGender);
		panel.add(rbFemale);
		panel.add(rbMale);
		panel.add(lbMeal);
		panel.add(cbChicken);
		panel.add(cbPizza);
		panel.add(lbEdu);
		panel.add(cxEdu);
		panel.add(bts);
		panel.add(lbSignup);
		panel.add(btSfood);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = new Dimension(500, 300);
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setPreferredSize(dim);
		frame.setLocation((res.height-500)/2, (res.width-300)/2);
	}
	
}
