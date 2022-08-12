import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_03_FileCopy {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("from.txt");
			
			FileOutputStream fos = new FileOutputStream("to.txt");
//			false or default : 화일이 없으면 생성, 있으면 새로 생성
//			true : 화일이 없으면 생성, 있으면  
			
				
			int i;
			while(true) {
				i = fis.read();
				System.out.println(i);
				if(i == -1)
					break;
				else {
					fos.write(i);
				}
			} // while
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}






