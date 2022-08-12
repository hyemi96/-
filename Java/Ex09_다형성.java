class Robot{
	
} // Robot

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}// DanceRobot

class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
}// SingRobot

class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}// DrawRobot

public class Ex09_다형성 {
	public static void main(String[] args) {
		
		DanceRobot dc = new DanceRobot();
		dc.dance();
		
		SingRobot sr = new SingRobot();
		sr.sing();
		
		Robot dc2 = (Robot)new DanceRobot();
//		dc2.dance();
		
		Robot sr2 = new SingRobot();
		Robot dr2 = new DrawRobot();
		
//		int a,b,c;
//		int[] x = new int[3];
		
		Robot[] arr = {new DanceRobot(),
						new SingRobot(),
						new DrawRobot()
					};
//		arr[0].dance();
		
		for(int i=0;i<arr.length;i++) {
			action(arr[i]);
		} // for
		
	}//main

	static void action(Robot r){ 
		// Robot r = (Robot)new DanceRobot()
		// Robot r = (Robot)new SingRobot()
		// Robot r = (Robot)new DrawRobot()
		
//		r.dance();
		if(r instanceof DanceRobot) { // true
//			r.dance();
			DanceRobot dr =(DanceRobot)r;
			dr.dance();
		} else if(r instanceof SingRobot) {
//			r.sing();
			SingRobot sr = (SingRobot)r;
			sr.sing();
		} else if(r instanceof DrawRobot) {
			DrawRobot dw = (DrawRobot)r;
			dw.draw();
		}
	}
	
} // class







