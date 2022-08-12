import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_05_Buffer {
	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("data.txt"); // 1����Ʈ�� 
			BufferedOutputStream bos = new BufferedOutputStream(fos,5); // 2����Ʈ��  
			
			for(int i=1;i<=9;i++) {
				bos.write(i);
			}
			
			FileInputStream fis = new FileInputStream("data.txt"); // 1����Ʈ�� 
			BufferedInputStream bis = new BufferedInputStream(fis,5); // 2����Ʈ��  
			
			int i;
			while( (i = bis.read()) != -1 ) {
				System.out.print(i +" ");
			}
			
			bos.close();
			bis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
