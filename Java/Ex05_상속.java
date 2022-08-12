class Sports{
	String name;
	int inwon;
	
	Sports(String name,int inwon){
		this.name = name;
		this.inwon = inwon;
	} // 생성자
	
	void display() {
		System.out.println("종목명:" + name);
		System.out.println("인원수:" + inwon);
	} // display
	
} //Sports

class Baseball extends Sports{
//	String name;
//	int inwon;
	double ta;
	
	Baseball(String name,int inwon,double ta){ // default 생성자
		super(name,inwon); // 부모 생성자 호출
//		this.name = name;
//		this.inwon = inwon;
		this.ta = ta;
	}
	
	void display() {
//		System.out.println("종목명:" + name);
//		System.out.println("인원수:" + inwon);
		
		super.display();
		System.out.println("타율:" + ta);
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
//		System.out.println("종목명:" + name);
//		System.out.println("인원수:" + inwon);
		super.display();
		System.out.println("골수:" + goal);
	} // display
}

public class Ex05_상속 {
	public static void main(String[] args) {

		Baseball bb = new Baseball("야구",9,0.345);
		bb.display();
		
		Sports fb = new Football("축구", 11, 6 );
		fb.display();
		
		System.out.println("-------------------");
		
		Sports[] sp = {new Baseball("야구",9,0.345),
						new Football("축구", 11, 6 )
					};
		
		for(int i=0;i<sp.length;i++) {
			sp[i].display();
		}
	}

}





