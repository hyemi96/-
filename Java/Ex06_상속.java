class Human{
	private String name;
	private int age;

	//	Human(){
	//		
	//	}
	Human(String name,int age){
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}//Human

class Employee extends Human{
	//	private String name;
	//	private int age;
	private String workplace;
	private String part;

	Employee(String name,int age,String workplace,String part){
		//		this.name = name;
		//		this.age = age;
		super(name,age);
		this.workplace = workplace;
		this.part = part;
	}

	void display() {
		super.display();
		System.out.println("workplace:"+workplace);
		System.out.println("part:"+part);
	}
}// Employee

class Teacher extends Employee{
	//	private String name;
	//	private int age;
	//	private String workplace;
	//	private String part;
	private String subject;
	Teacher(String name,int age,String workplace,String part,String subject){
		super(name,age,workplace,part);
		this.subject = subject;
	}
	
	void display() {
		super.display();
		System.out.println("subject:"+subject);
	}

}// Teacher

public class Ex06_»ó¼Ó {
	public static void main(String[] args) {
		Human h = new Human("½á´Ï",30); 
		Employee e = new Employee("À¢µð",20,"»ï¼º","È«º¸ºÎ");
		Teacher t = new Teacher("½½±â",40,"Áß¾Ó°í","»ýÈ°ÁöµµºÎ","À½¾Ç");
		//		h.name = "½á´Ï";

		h.display();
		System.out.println();
		
		e.display();
		System.out.println();
		
		t.display();

	}

}

