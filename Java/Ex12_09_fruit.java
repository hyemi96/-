import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

class Sub09 extends JFrame{
	
	String[] text = {"사과","배","체리"};
	JRadioButton[] radio = new JRadioButton[3]; // 관리자

	ImageIcon[] image = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")
	};

	JLabel imageLabel = new JLabel("   ");
	
	Sub09(String title){
		super(title);

		Container contentPane = getContentPane();

		JPanel p = new JPanel();
		p.setBackground(Color.gray);

		ButtonGroup group = new ButtonGroup();
		for(int i=0;i<text.length;i++) {
			radio[i] = new JRadioButton(text[i]);
			group.add(radio[i]);
			p.add(radio[i]);
			radio[i].addItemListener(new RadioButtonEvent());
		}

		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(p,BorderLayout.NORTH);
		contentPane.add(imageLabel,BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,400);
		setVisible(true);

	} // 생성자

	class RadioButtonEvent implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			//			System.out.println("itemStateChanged");
			//			e.getSource()

			if(radio[0].isSelected()) {
				//System.out.println("사과");
				imageLabel.setIcon(image[0]);
			} 
			else if(radio[1].isSelected()) {
				//System.out.println("배");
				imageLabel.setIcon(image[1]);
			}
			else if(radio[2].isSelected()) {
				//System.out.println("체리");
				imageLabel.setIcon(image[2]);
			}
		}
	} // RadioButtonEvent

} // Sub09

public class Ex12_09_fruit {
	public static void main(String[] args) {
		new Sub09("라디오버튼 ItemEvent예제");
	}

}
