import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Sub08 extends JFrame{
	Sub08(String title){
		super(title);
		//		setSize(400,300);


		Container contentPane = getContentPane();

		JPanel p1 = new JPanel();
		p1.setBackground(Color.yellow);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.cyan);

		contentPane.add(p1,BorderLayout.CENTER);
		contentPane.add(p2,BorderLayout.SOUTH);

		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);

		p1.add(text1);
		p1.add(new JLabel("+"));
		p1.add(text2);
		p1.add(new JLabel("="));
		p1.add(text3);

		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");

		p2.add(btn1);
		p2.add(btn2);

		OkButton ok = new OkButton(text1,text2,text3);
		CancelButton cancel = new CancelButton(text1,text2,text3);

		btn1.addActionListener(ok);// 확인
		btn2.addActionListener(cancel);// 취소

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack(); // 
		setVisible(true);
	} // 생성자
} // Sub08

class OkButton implements ActionListener{

	JTextField text1,text2,text3;

	OkButton(JTextField text1,JTextField text2,JTextField text3){
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//		System.out.println("OkButton");
		try {
			//	int a = Integer.parseInt("123"); // "123" => 123
			int num1 = Integer.parseInt(text1.getText());// String("12")=>int(12)
			int num2 = Integer.parseInt(text2.getText());// String("34")=>int(12)
			int sum = num1 + num2;
			String strSum = String.valueOf(sum); // int => String
			//text3.setText(strSum);
			text3.setText(sum+"");
			
		} catch(NumberFormatException e2) {
			JOptionPane.showMessageDialog(null,"숫자만 입력가능");
			
			text1.setText("");
			text2.setText("");
			text3.setText("");
		}
	}

} // OkButton

class CancelButton implements ActionListener{
	
	JTextField text1,text2,text3;
	
	CancelButton(JTextField text1,JTextField text2,JTextField text3){
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//		System.out.println("CancelButton");
		
		text1.setText("");
		text2.setText("");
		text3.setText("");
		
	}

}// CancelButton

public class Ex12_08_Add {
	public static void main(String[] args) {

		new Sub08("덧셈 프로그램");
	}

}
