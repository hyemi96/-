import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11_04_FileReader {
	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("write.txt");
			fw.write("즐거운 자바수업~");
			fw.close();

			FileReader fr = new FileReader("write.txt");// FileNotFoundException
			// new FileNotFoundException()
			
			int i;
			while( (i=fr.read()) != -1) {
				System.out.print((char)i);
				
			}
			fr.close();
			
			//IOException e = new FileNotFoundException()
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
