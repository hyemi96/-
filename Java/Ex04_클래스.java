class Person{
	private String name;
	int age;
	double height;
	static String nation;

	// 생성자
	Person(){
		System.out.println("Person 생성자");
	}

	// 생성자
	Person(String name,int age,double height){
		//System.out.println("Person 생성자");
		this.name = name;
		this.age = age;
		this.height = height;
	}

	//	메서드 정의 
	void setName(String n) {
		//System.out.println("abc");
		name = n;
	}

	String getName(){
		return name;
	}
}

public class Ex04_클래스 {
	public static void main(String[] args) {
		
		int a;
		a=11;
		Person p1 = new Person(); // p1:참조변수
		//		p1.name = "홍길동";
		p1.age = 25;
		p1.height = 149.8;
		Person.nation = "대한민국";
		//		p1.nation="대한민국";
		p1.setName("홍길동"); // abc호출
		//		System.out.println(p1.name);
		System.out.println(p1.getName());



		Person p2 = new Person(); // p1:참조변수
		//	p2.name = "윤아";
		p2.age = 35;
		p2.height = 189.8;

		//		System.out.println(p2.name);
		System.out.println(p2.nation);

		Person p3 = new Person("하니",10,123.4); 
		System.out.println(p3.getName());
		System.out.println(p3.age);
		System.out.println(p3.height);
	}

}




