
public class Ex10_String {
	public static void main(String[] args) {
//		Object
//			:
		String s1 = "Hello";
		String s2 = new String("hello");
		
		boolean result1 = s1.equals(s2);
		System.out.println("result1:" + result1);
		
		System.out.println(s1==s2);
		
		boolean result2 = s1.equalsIgnoreCase(s2);
		System.out.println("result2:" + result2);
		
		int len = s1.length();
		System.out.println("len:" + len);
		
		System.out.println(s1.toString());
		
		
		String s3 = "apple,banana orange,melon#pear";
		String[] s = s3.split(" ");
		
		System.out.println(s.length);
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			
		}
		
	}

}






