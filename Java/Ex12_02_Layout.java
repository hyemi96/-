import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

// -Dfile.encoding=MS949
class Sub02 extends Frame{
	Button east = new Button("동쪽");
	Button west = new Button("서쪽");
	Button south = new Button("남쪽");
	Button north = new Button("북쪽");
	Button center = new Button("중앙");
	
	Sub02(String title){
		super(title);
		setSize(400,300);
		setVisible(true);
		
//		setLayout(new FlowLayout());
//		setLayout(new BorderLayout()); 
//		Frame의 기본 배치관리자 : 
		
//		setLayout(new GridLayout(3,2)); 
		
		add(east,BorderLayout.EAST); // this 생략 가능
		super.add(west,BorderLayout.WEST);
		this.add(south,BorderLayout.SOUTH);
		this.add(north,BorderLayout.NORTH);
//		this.add(center,BorderLayout.CENTER);
		add("Center",center);
		
	}
}
public class Ex12_02_Layout {
	public static void main(String[] args) {
		new Sub02("Sub02제목");
	}

}
