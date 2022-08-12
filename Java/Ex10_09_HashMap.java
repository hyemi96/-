import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book{
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return title+"/"+price;
	}
}

public class Ex10_09_HashMap {
	public static void main(String[] args) {

		Map<String,Book> hm = new HashMap<String,Book>();
		
		Book bk1 = new Book("�ڹ�",3000);
		Book bk2 = new Book("����Ŭ",2000);
		Book bk3 = new Book("JSP",1000);
		
		hm.put("��������",bk1);
		hm.put("��ǳ����",bk2);
		hm.put("yes24",new Book("JSP",1000));
		
		System.out.println(hm);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�:");
		String bookstore = sc.next();
		
		if(hm.get(bookstore) == null) {
			System.out.println("���� �߸� �Է���");
		}
		else {
			System.out.println(hm.get(bookstore));
		}
		
		System.out.println(hm.size());
		
		hm.clear();
		System.out.println(hm.size());
	}
                                                                     
}





