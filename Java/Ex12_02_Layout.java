import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

// -Dfile.encoding=MS949
class Sub02 extends Frame{
	Button east = new Button("����");
	Button west = new Button("����");
	Button south = new Button("����");
	Button north = new Button("����");
	Button center = new Button("�߾�");
	
	Sub02(String title){
		super(title);
		setSize(400,300);
		setVisible(true);
		
//		setLayout(new FlowLayout());
//		setLayout(new BorderLayout()); 
//		Frame�� �⺻ ��ġ������ : 
		
//		setLayout(new GridLayout(3,2)); 
		
		add(east,BorderLayout.EAST); // this ���� ����
		super.add(west,BorderLayout.WEST);
		this.add(south,BorderLayout.SOUTH);
		this.add(north,BorderLayout.NORTH);
//		this.add(center,BorderLayout.CENTER);
		add("Center",center);
		
	}
}
public class Ex12_02_Layout {
	public static void main(String[] args) {
		new Sub02("Sub02����");
	}

}
