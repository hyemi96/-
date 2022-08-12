import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex13_03_Client {
	public static void main(String[] args) throws IOException {

		Socket cs = null;
		
		try {
			cs = new Socket("localhost",5555);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(
							new InputStreamReader(System.in));
		
		System.out.print("클라이언트의 입력 : ");
		String clientLine = br.readLine(); 
		
		PrintWriter pw = new PrintWriter(cs.getOutputStream());
		
		pw.println(clientLine);
		
		pw.close();
		br.close();
		
	}
}
