import java.io.File;

public class Ex11_01_File {
	public static void main(String[] args) {
		File win = new File("c:\\windows");
		System.out.println("win:" + win);
		
//		���ǽ�?��:����
		String result = win.isDirectory() ? "����" : "����";
		System.out.println(result);
		
		String[] lists = win.list();
		System.out.println(lists.length);
		
		for(int i=0;i<lists.length;i++) {
			File win2 = new File(win,lists[i]); // c:\\windows\\addins
			if(win2.isFile()) {
				System.out.println("����:" + lists[i]);
			}
			else {
				System.out.println("����:" + lists[i]);
			}
		} // for
		
	}
}




