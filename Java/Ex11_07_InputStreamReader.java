import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_07_InputStreamReader {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		
		String str;
		try {
			System.out.print("파일 이름을 입력하세요->");
			String fileName = br.readLine(); // c:\\sun\\abc.txt
			
			System.out.println("파일에 저장할 내용을 입력하세요.");
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			
			while( (str = br.readLine()) != null) { // ctrl+z
				bw.write(str);
//				bw.write("\r\n"); //
				bw.newLine(); //  
				
			}
			System.out.println("여기까지 입력 끝");
			bw.close();
			br.close();
			
//			FileReader fr = new FileReader(fileName);
//			BufferedReader br2 = new BufferedReader(fr); 
			
//			abc.txt
//			가 나 다
//			라마바 사
//			아
			
			BufferedReader br2 = new BufferedReader(
									new FileReader(fileName));
			
			String str2;
			while( (str2 = br2.readLine()) != null ) { // 
				System.out.println(str2);
			}
			
			br2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

//파일 이름을 입력하세요->c:\\sun\\abc.txt
//파일에 저장할 내용을 입력하세요.
//가나 다라(엔터)
//마바사(엔터)
//하하 ^^
//입력을 마칩니다.




