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
			System.out.println("5555 ��Ʈ ��ȣ�� ������ �� �����ϴ�.");
			System.exit(1);
		}
		
		Socket cs = null;
		System.out.println("Server ready...");
		
		try {
			cs = ss.accept();
			System.out.println("������ �����");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(cs.getInputStream()));
		
		String line = br.readLine(); //
		System.out.println("Ŭ���̾�Ʈ�� ������ ������ : " + line);
		
		br.close();
		cs.close();
		ss.close();
	}

}





