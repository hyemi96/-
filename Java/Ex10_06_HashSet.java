import java.util.HashSet;
import java.util.Iterator;

public class Ex10_06_HashSet {
	public static void main(String[] args) {

		//		List : ������ �ִ�. �ߺ���� �Ѵ�.
		//		Set : ������ ����. �ߺ���� ���Ѵ�.

		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.size());

		hs.add("aa");
		hs.add("bb");
		hs.add("cc");
		hs.add("aa");
		hs.add("dd");

		System.out.println(hs.size());
		System.out.println(hs); //[aa, bb, cc, dd]

		//System.out.println(hs.get(1));

		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println(hs.contains("bb"));
		System.out.println(hs.contains("xy"));



		//1~10���� ���� �߻�
		//System.out.println(Math.random());

		HashSet<Integer> hs2 = new HashSet<Integer>();
		int i=0;
		while(true) {
			i++;
			int num = (int)(Math.random()*10) + 1;
			hs2.add(num);
			//System.out.println(num);
			if(hs2.size()==6)
				break;
		}
		System.out.println("i:"+i);
		System.out.println(hs2);

	}

}




