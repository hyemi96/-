class Product{
	private String code;
	private String company;

	/*
	 * Product(){
	 * 
	 * }
	 */
	Product(String code,String company){
		this.code = code;
		this.company = company;
	}
	
	void show() {
		System.out.println("code:"+code);
		System.out.println("company:"+company);
	}
}

class Computer extends Product{
//	private String code;
//	private String company;
	private String os;
	private int ram;
	
	Computer(String code,String company,String os,int ram){
		//this.code = code;
		super(code,company);
		this.os = os;
		this.ram = ram;
	}
	
//	void show() {
//		System.out.println("code:"+code);
//		System.out.println("company:"+company);
//	}
	
	void show() { // overriding 
//		System.out.println("code:"+code);
//		System.out.println("company:"+company);
		super.show();
		System.out.println("os:"+os);
		System.out.println("ram:"+ram);
	}
}

public class Ex07_»ó¼Ó {
	public static void main(String[] args) {
		
		Product p = new Product("P01","Áß¾Ó"); // code, company
		Computer c = new Computer("C01","»ï¼º","window10",64);   
		
		p.show();
		c.show();
	}
}


