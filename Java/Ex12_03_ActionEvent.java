import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Sub03 extends Frame implements ActionListener{
	
	Button b1;
	Button b2,b3;
	
	Sub03(){
		
		setSize(400,300);
		setVisible(true);
		
		b1 = new Button("�����");
		b2 = new Button("������");
		b3 = new Button("�Ķ���");
		
//		Button : ActionEvent
		b1.addActionListener(this); // new ActionEvent() 
		b2.addActionListener(this);
		b3.addActionListener(this);
//		this:
			
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		
		this.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						
					} // windowClosing
					
				}//WindowAdapter
				
		);//addWindowListener
		
	}

	@Override
//	ActionEvent e = new ActionEvent() 
	public void actionPerformed(ActionEvent e) {
//		System.out.println("actionPerformed");
		
		Object obj = e.getSource();
		if(obj == b1) {
			setBackground(Color.yellow);
		}
		else if(obj == b2) {
			setBackground(Color.RED);
		} 
		else if(obj == b3) {
			setBackground(Color.blue);
		} 
	}
} // Sub03

public class Ex12_03_ActionEvent {
	public static void main(String[] args) {

		new Sub03();
	}

}

//1.frame�����.
//2.��ư 3�� ����
//3.��ġ������ ����
//4.��ư �̺�Ʈ => ActionEvent
//5.Ŭ���� ActionListener ���, ��ư�� ActionListener ����, �ڵ�ȣ��Ǵ� �޼���(actionPerformed)
//6.�ڵ�ȣ��Ǵ� �޼��忡�� ��� ����
















