import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Sub07 extends Frame{
	/*
	Sub07(){
		setSize(300,200);
		setVisible(true);
		this.addWindowListener(new MyWindow());
	}
	
	class MyWindow extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}// MyWindow
	*/
	
	Sub07(){
		setSize(300,200);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
}// Sub07

public class Ex12_07_WindowAdapter {

	public static void main(String[] args) {

		new Sub07();
	}

}
