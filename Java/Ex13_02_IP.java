import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Ex13_02_IP {
	public static void main(String[] args) {
		
		System.out.println("�� ����Ʈ �ּҸ� �Է��ϼ��� -> ");
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		
		try {
			String url = br.readLine(); // www.naver.com
			
			InetAddress[] address = InetAddress.getAllByName(url);
			
			for(int i=0;i<address.length;i++) {
				System.out.println(address[i]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}




