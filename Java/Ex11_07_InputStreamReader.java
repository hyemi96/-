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
			System.out.print("���� �̸��� �Է��ϼ���->");
			String fileName = br.readLine(); // c:\\sun\\abc.txt
			
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			
			while( (str = br.readLine()) != null) { // ctrl+z
				bw.write(str);
//				bw.write("\r\n"); //
				bw.newLine(); //  
				
			}
			System.out.println("������� �Է� ��");
			bw.close();
			br.close();
			
//			FileReader fr = new FileReader(fileName);
//			BufferedReader br2 = new BufferedReader(fr); 
			
//			abc.txt
//			�� �� ��
//			�󸶹� ��
//			��
			
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

//���� �̸��� �Է��ϼ���->c:\\sun\\abc.txt
//���Ͽ� ������ ������ �Է��ϼ���.
//���� �ٶ�(����)
//���ٻ�(����)
//���� ^^
//�Է��� ��Ĩ�ϴ�.




