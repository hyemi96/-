import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class Sub10 extends JFrame{
	Sub10(){
		
		String[] title = {"이름","직업","나이"};
		Object[][] data = {
							{"성시경","가수",38},
							{"신동엽","개그맨",45},
							{"김연아","운동선수",22}
						 };
		
		JTable table = new JTable(data,title);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		Container ct = getContentPane();
		ct.add(scrollPane);
		
		setSize(400,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}

public class Ex12_10_JTable {
	public static void main(String[] args) {
		new Sub10();
	}

}
