import java.util.ArrayList;

public class Ex10_02_ArrayList {
	public static void main(String[] args) {
//		Object
//			:
		ArrayList<String> list = new ArrayList<String>();
		int size = list.size();
		System.out.println("size:" + size);
		
		list.add("�¿�");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("���");
		
		size = list.size();
		System.out.println("size:" + size);
		System.out.println("list:" + list.toString());
		System.out.println("list:" + list);
		
		String get1 = list.get(1);
		System.out.println("get1:"+get1);
		
		list.add(1,"����");
		System.out.println("list:" + list);
		
		list.remove(1);
		System.out.println("list:" + list);
		
		list.remove("����");
		System.out.println("list:" + list);
		
		int pos1 = list.indexOf("����");
		System.out.println("pos1:" + pos1);
		
		System.out.println(list.indexOf("ȿ��"));
		
		System.out.println(list.contains("����"));
		
		list.set(1, "Ƽ�Ĵ�");
		System.out.println("list:" + list);
		
	}

}






