class Person{
	private String name;
	int age;
	double height;
	static String nation;

	// ������
	Person(){
		System.out.println("Person ������");
	}

	// ������
	Person(String name,int age,double height){
		//System.out.println("Person ������");
		this.name = name;
		this.age = age;
		this.height = height;
	}

	//	�޼��� ���� 
	void setName(String n) {
		//System.out.println("abc");
		name = n;
	}

	String getName(){
		return name;
	}
}

public class Ex04_Ŭ���� {
	public static void main(String[] args) {
		
		int a;
		a=11;
		Person p1 = new Person(); // p1:��������
		//		p1.name = "ȫ�浿";
		p1.age = 25;
		p1.height = 149.8;
		Person.nation = "���ѹα�";
		//		p1.nation="���ѹα�";
		p1.setName("ȫ�浿"); // abcȣ��
		//		System.out.println(p1.name);
		System.out.println(p1.getName());



		Person p2 = new Person(); // p1:��������
		//	p2.name = "����";
		p2.age = 35;
		p2.height = 189.8;

		//		System.out.println(p2.name);
		System.out.println(p2.nation);

		Person p3 = new Person("�ϴ�",10,123.4); 
		System.out.println(p3.getName());
		System.out.println(p3.age);
		System.out.println(p3.height);
	}

}




