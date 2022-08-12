class Top<T> extends Object{
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
}


public class Ex10_01_generic {
	public static void main(String[] args) {
		Top<String> t1 = new Top<String>();
		//t1.data = "abc";
		t1.setData("Hello");
//		System.out.println(t1.getData());
		String str = t1.getData();
		System.out.println("str:" + str);
		System.out.println("--------------------");
		
//		wrapper 클래스 : 기본 자료형(8)을 객체로 만들수 있는 클래스
//		int : Integer
//		double : Double
//		boolean : Boolean
		
		Top<Integer> t2 = new Top<Integer>();
		t2.setData(123);
//		Integer it = t2.getData();
		int it = t2.getData();
		System.out.println("it:" + it);
		System.out.println("--------------------");
		
		Top t3 = new Top();
		//t1.data = "abc";
		t3.setData("Hello");
//		System.out.println(t1.getData());
		String str3 = (String)t3.getData();
		System.out.println("str3:" + str3);
		
	}
}


