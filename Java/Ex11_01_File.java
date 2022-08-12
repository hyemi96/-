import java.io.File;

public class Ex11_01_File {
	public static void main(String[] args) {
		File win = new File("c:\\windows");
		System.out.println("win:" + win);
		
//		조건식?참:거짓
		String result = win.isDirectory() ? "폴더" : "파일";
		System.out.println(result);
		
		String[] lists = win.list();
		System.out.println(lists.length);
		
		for(int i=0;i<lists.length;i++) {
			File win2 = new File(win,lists[i]); // c:\\windows\\addins
			if(win2.isFile()) {
				System.out.println("파일:" + lists[i]);
			}
			else {
				System.out.println("폴더:" + lists[i]);
			}
		} // for
		
	}
}




