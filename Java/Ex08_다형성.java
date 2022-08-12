class Car{
	String color = "white";
	int door = 4;
	
	void drive() {
		System.out.println("drive~");
	} // drive
	
	void stop() {
		System.out.println("stop!");
	} // stop
	
} // Car

class FireEngine extends Car{
	int door = 6;
	int wheel = 10;
	
	void drive() {
		System.out.println("FEdrive~");
	}
	void water() {
		System.out.println("water!!");
	}
}


public class Ex08_다형성 {
	public static void main(String[] args) {
	
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = (Car)fe; // 업캐스팅(자식타입->부모타입)은 자동이다.
		System.out.println(car.door);
		System.out.println(car.color);
		
		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);
		
		car.drive();
//		car.water();
		
		fe.drive();
		fe.water();
		
		fe2 = (FireEngine)car; // 다운캐스팅(부모타입->자식타입)
		fe2.water();
		fe2.drive();
	}

}






