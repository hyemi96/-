import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex13_03_Server {
	public static void main(String[] args) throws IOException {

		ServerSocket ss = null;
		
		try {
			ss = new ServerSocket(5555);
			
		} catch (IOException e) {
			System.out.println("5555 포트 번호에 연결할 수 없습니다.");
			System.exit(1);
		}
		
		Socket cs = null;
		System.out.println("Server ready...");
		
		try {
			cs = ss.accept();
			System.out.println("서버에 연결됨");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(cs.getInputStream()));
		
		String line = br.readLine(); //
		System.out.println("클라이언트가 보내온 데이터 : " + line);
		
		br.close();
		cs.close();
		ss.close();
	}

}





