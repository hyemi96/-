import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex10_08_HashMap {
	public static void main(String[] args) {

		Map<String,String> dic = new HashMap<String,String>();

		dic.put("pencil","����");
		dic.put("sky","�ϴ�");
		dic.put("desk","å��");
		dic.put("face","��");

		System.out.println(dic);

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("ã�� �ܾ��?(q�Է½� ����)");
			String word = sc.next();
			
			if(word.equals("q"))
				break;
			
			//if(dic.get(word) == null) {
			if(dic.containsKey(word) == false) {
				System.out.println("�߸� �Է��ϼ���");
			}
			else {
				System.out.println("��:"+dic.get(word));
			}
		}//while

		// ����
		System.out.println("���α׷��� �����մϴ�.");
		
	} // main

}







