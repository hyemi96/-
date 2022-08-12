class Sports{
	String name;
	int inwon;
	
	Sports(String name,int inwon){
		this.name = name;
		this.inwon = inwon;
	} // ������
	
	void display() {
		System.out.println("�����:" + name);
		System.out.println("�ο���:" + inwon);
	} // display
	
} //Sports

class Baseball extends Sports{
//	String name;
//	int inwon;
	double ta;
	
	Baseball(String name,int inwon,double ta){ // default ������
		super(name,inwon); // �θ� ������ ȣ��
//		this.name = name;
//		this.inwon = inwon;
		this.ta = ta;
	}
	
	void display() {
//		System.out.println("�����:" + name);
//		System.out.println("�ο���:" + inwon);
		
		super.display();
		System.out.println("Ÿ��:" + ta);
	} // display
	
}// Baseball

class Football extends Sports{
//	String name;
//	int inwon;
	int goal;
	
	Football(String name,int inwon,int goal){
		super(name,inwon);
//		this.name = name;
//		this.inwon = inwon;
		this.goal = goal;
	}
	
	void display() {
//		System.out.println("�����:" + name);
//		System.out.println("�ο���:" + inwon);
		super.display();
		System.out.println("���:" + goal);
	} // display
}

public class Ex05_��� {
	public static void main(String[] args) {

		Baseball bb = new Baseball("�߱�",9,0.345);
		bb.display();
		
		Sports fb = new Football("�౸", 11, 6 );
		fb.display();
		
		System.out.println("-------------------");
		
		Sports[] sp = {new Baseball("�߱�",9,0.345),
						new Football("�౸", 11, 6 )
					};
		
		for(int i=0;i<sp.length;i++) {
			sp[i].display();
		}
	}

}





