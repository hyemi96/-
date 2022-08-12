import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex10_07_HashMap {
	public static void main(String[] args) {

//		Map : Ű(key),��(value)�� ������ ����
//		Ű:�ߺ�X
//		��:�ߺ�O
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		System.out.println(hm.size());
		
		hm.put("����",20);
		hm.put("����",30);
		hm.put("����",40);
		hm.put("������",30);
		
		System.out.println(hm);
		System.out.println(hm.get("����"));
		System.out.println(hm.get("����"));
		
		if(hm.get("����") == null) {
			System.out.println("�ش� Ű�� ����");
		}
		
		System.out.println(hm.get(30));
		
		System.out.println(hm.containsKey("����"));
		System.out.println(hm.containsKey("����"));
		
		System.out.println(hm.containsValue(30));
		System.out.println(hm.containsValue(300));
		
		System.out.println();
		
		Set<String> ks = hm.keySet();
		System.out.println("ks:"+ks);
		
		Iterator<String> iter = ks.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name +":" + hm.get(name));
		}
//		����:40
//		����:20
//		����:30
//		������:30
		
			
		
		
	}
}




