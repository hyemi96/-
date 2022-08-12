import java.util.ArrayList;
import java.util.Scanner;

class Person {
	private String id;
	private String pw;
	
	Person(String id,String pw){
		this.id = id;
		this.pw = pw;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String toString() {
		return id+":"+pw;
	}
} // Person

public class Ex10_03_ArrayList{
	public static void main(String[] args) {

		Person p1 = new Person("kim","1234");
		Person p2 = new Person("park","5678");
		Person p3 = new Person("choi","9876");
		
		System.out.println(p1);
		System.out.println(p1.toString());
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println("list:" + list.toString());
		
		System.out.println(list.size());
		
//		length:�迭�� ����
//		length():���ڿ��� ����(����)
//		size():�÷��Ǿ��� ����� ����
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ID:");
			String id = sc.next();
			
			System.out.print("PW:");
			String pw = sc.next();
			
			Person p = new Person(id,pw);
			list.add(p);
			
			System.out.print("���?");
			String retry = sc.next(); // "y" or "a,b,c,n"
			
			if(!retry.equals("y")) {
				break;
			}
			
		} // while

		System.out.println("list:" + list);
		
		for(int i=0;i<list.size();i++) {
			Person ps = list.get(i);
			System.out.println("ps:"+ps);
		}
		
		boolean flag = false;
		System.out.print("ã�� ID �Է� : ");
		String searchId = sc.next();
		
		for(int i=0;i<list.size();i++) {
			Person ps = list.get(i);
			if(ps.getId().equals(searchId)) {
				System.out.println("ã�� PW:"+ps.getPw());
				flag = true;
			}
//			else {
//				System.out.println("ã�� ID �����ϴ�.");
//			}
		} // for
		
		// ����
		if(flag == false) {
			System.out.println("ã�� ID�� �����ϴ�.");
		}
		
	} // main

} // class 







