import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex10_07_HashMap {
	public static void main(String[] args) {

//		Map : 키(key),값(value)의 쌍으로 저장
//		키:중복X
//		값:중복O
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		System.out.println(hm.size());
		
		hm.put("슬기",20);
		hm.put("조이",30);
		hm.put("웬디",40);
		hm.put("아이유",30);
		
		System.out.println(hm);
		System.out.println(hm.get("조이"));
		System.out.println(hm.get("윤아"));
		
		if(hm.get("윤아") == null) {
			System.out.println("해당 키는 없음");
		}
		
		System.out.println(hm.get(30));
		
		System.out.println(hm.containsKey("조이"));
		System.out.println(hm.containsKey("윤아"));
		
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
//		웬디:40
//		슬기:20
//		조이:30
//		아이유:30
		
			
		
		
	}
}




