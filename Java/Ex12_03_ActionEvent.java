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
		
		b1 = new Button("노란색");
		b2 = new Button("빨간색");
		b3 = new Button("파란색");
		
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

//1.frame만든다.
//2.버튼 3개 생성
//3.배치관리자 설정
//4.버튼 이벤트 => ActionEvent
//5.클래스 ActionListener 상속, 버튼에 ActionListener 부착, 자동호출되는 메서드(actionPerformed)
//6.자동호출되는 메서드에서 기능 구현
















