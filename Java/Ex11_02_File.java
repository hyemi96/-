import java.io.File;
import java.io.IOException;

public class Ex11_02_File {
	public static void main(String[] args) {
		// 기본위치 C:\Java_ysy\11_화일입출력
		File f1 = new File("A");
		File f2 = new File("B");
		File f3 = new File("C");
		File f4 = new File(f1,"ab.txt"); // A\\ab.txt

		if(f1.exists()) {
			System.out.println("이미 존재함");
			f1.renameTo(f2);
		}
		else {
			f1.mkdir();
			System.out.println("폴더 생성함");
			
			try {
				f4.createNewFile();
				System.out.println("화일 생성함");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // else
		
		if(f3.exists()) {
			f3.delete();
		}
	}

}




